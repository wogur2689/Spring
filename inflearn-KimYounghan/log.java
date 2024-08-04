import java.util.logging.Level;

public class log {

    private final static java.util.logging.Logger LOG = java.util.logging.Logger.getGlobal();

    public static void main(String[] args) {

        LOG.setLevel(Level.INFO);

        LOG.severe("severe");
        LOG.warning("warning");
        LOG.info("info");
    }
}
