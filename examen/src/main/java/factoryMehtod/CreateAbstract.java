package factoryMehtod;

public abstract class CreateAbstract {

    public static final int AUDIO = 1;
    public static final int VIDEO = 2;

    public abstract IFile create(int tipo);

}
