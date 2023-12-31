package Assignment;
import java.util.Random;

public class Catch {
    public Pokeball pokeball;
    public boolean success;
    public int catchTime;

    public Catch() {
        this.pokeball = new Pokeball();
        setRandomSuccess();
    }

    public Catch(int catchTime) {
        this();
        this.catchTime = catchTime;
    }

    private void setRandomSuccess() {

        switch (pokeball.getBallType()) {
            case ULTRA_BALL:
                this.success = new Random().nextDouble() < 0.7;
                break;
            case GREAT_BALL:
                this.success = new Random().nextDouble() < 0.6;
                break;
            case POKE_BALL:
                this.success = new Random().nextDouble() < 0.5;
                break;
            case MASTER_BALL:
                this.success = true;
                break;
            default:
                this.success = false;
        }
    }

    public final Pokeball getPokeball() {
        return pokeball;
    }

    public final void setPokeball(Pokeball pokeball) {
        this.pokeball = pokeball;
    }
    public final boolean isSuccess() {
        return success;
    }

    public final void setSuccess(boolean success) {
        this.success = success;
    }

    public final int getCatchTime() {
        return catchTime;
    }

    public final void setCatchTime(int catchTime) {
        this.catchTime = catchTime;
    }
    @Override
    public String toString() {
        return "Catch2 [pokeball=" + pokeball + ", success=" + success + ", catchTime=" + catchTime + "]";
    }
}