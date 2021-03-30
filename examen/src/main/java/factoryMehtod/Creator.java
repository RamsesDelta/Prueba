package factoryMehtod;

public class Creator extends CreateAbstract{

    @Override
    public IFile create(int type) {
        IFile objeto;
        switch( type )
        {
            case AUDIO:
                objeto = new FileAudio();
                break;
            case VIDEO:
                objeto = new FileVideo();
                break;
            default:
                objeto = null;
        }
        return objeto;
    }
}
