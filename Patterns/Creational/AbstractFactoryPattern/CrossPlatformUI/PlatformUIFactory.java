package Patterns.Creational.AbstractFactoryPattern.CrossPlatformUI;

class PlatformUIFactory {
    public static UIFactory getPlatformUI(PlatformType platformType) {
        switch(platformType) {
            case WINDOWS: return new WindowsUIFactory();
            case MAC: return new MacUIFactory();
            case LINUX: return new LinuxUIFactory();
            default: throw new UnsupportedOperationException("Unknown Platform");
        }
    }
}