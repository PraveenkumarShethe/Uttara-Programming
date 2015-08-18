import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;
 
public class RhinoEngine {
    public static void main(String[] args) {
        ScriptEngineManager mgr = new ScriptEngineManager();
        // Now we can go and get a script engine we want. 
        // This can be done either by finding a factory that supports 
        // our required scripting language 
        // (engine = factory.getScriptEngine();)
        // or by requesting a script engine that supports a 
        // given language by name from the script engine manager.
        ScriptEngine engine = mgr.getEngineByName("JavaScript");
 
        // Now we have a script engine instance that 
        // can execute some JavaScript
        try {
            engine.put("name", "manju");
            engine.eval("print('Hello ' + name + '!')");
        } catch (ScriptException ex) {
            ex.printStackTrace();
        }    
    }
}
