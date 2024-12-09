/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ecosystemworkflow.DB4OUtil;

import ecosystemworkflow.ConfigureASystem;
import com.db4o.Db4oEmbedded;
import com.db4o.ObjectContainer;
import com.db4o.ObjectSet;
import com.db4o.config.EmbeddedConfiguration;
import com.db4o.ext.DatabaseFileLockedException;
import ecosystemworkflow.EcoSystem;
import java.io.File;

/**
 *
 * @author gunav
 */
public class DB4OUtil {
    
    private static final String FILENAME = "DataBank.db4o";
    private static DB4OUtil dB4OUtil;
    
    private DB4OUtil() {}
    
    public synchronized static DB4OUtil getInstance() {
        if (dB4OUtil == null) {
            dB4OUtil = new DB4OUtil();
        }
        return dB4OUtil;
    }
    
    public synchronized void storeSystem(EcoSystem system) {
        ObjectContainer conn = createConnection();
        conn.store(system);
        conn.commit();
        conn.close();
    }
    
    public EcoSystem retrieveSystem() {
        ObjectContainer conn = createConnection();
        ObjectSet<EcoSystem> systems = conn.query(EcoSystem.class);
        EcoSystem system;
        if (systems.size() == 0) {
            system = ConfigureASystem.configure();
        } else {
            system = systems.get(systems.size() - 1);
        }
        conn.close();
        return system;
    }
    
private ObjectContainer createConnection() {
    try {
        String filePath = System.getProperty("user.home") + "/DataBank.db4o";
        
        EmbeddedConfiguration config = Db4oEmbedded.newConfiguration();
        config.common().activationDepth(Integer.MAX_VALUE);
        config.common().updateDepth(Integer.MAX_VALUE);
        config.common().objectClass(EcoSystem.class).cascadeOnUpdate(true);
        
        // Create directory if it doesn't exist
        File dbFile = new File(filePath);
        dbFile.getParentFile().mkdirs();
        
        // Try to open existing file or create new one
        return Db4oEmbedded.openFile(config, filePath);
        
    } catch (DatabaseFileLockedException ex) {
        System.out.println("Database is locked. Please ensure no other instance is running.");
        return null;
    } catch (Exception ex) {
        System.out.println("Database Connection Error: " + ex.getMessage());
        ex.printStackTrace();
        return null;
    }
}
    
}
