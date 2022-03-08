public class Factory {
 public static void main(String[] args) {
        BasicCombo comboplan = new ComboCreationLogic();
        SmartPhone ram = comboplan.createCombo("ram");
        SmartPhone camera = comboplan.createCombo("camera");
        SmartPhone processor = comboplan.createCombo("processor");
    }

}


abstract class SmartPhone {

    public abstract void ram();
    public abstract void Camera();
    public abstract void processor();

}


class Samsung extends SmartPhone {
    @Override
    public void ram() {
        System.out.println("Add ram.");
    }
    @Override
    public void Camera() {
        System.out.println("Add Camera.");
    }
    @Override
    public void processor() {
        System.out.println("Add processor.");
    }
}


class Nokia extends SmartPhone {
    @Override
    public void ram() {
        System.out.println("Add ram.");
    }
    @Override
    public void Camera() {
        System.out.println("Add Camera.");
    }
    @Override
    public void processor() {
        System.out.println("Add processor.");
    }
}

class Huawei extends SmartPhone {
    @Override
    public void ram() {
        System.out.println("Add ram.");
    }
    @Override
    public void Camera() {
        System.out.println("Add Camera.");
    }
    @Override
    public void processor() {
        System.out.println("Add processor.");
    }
}


abstract class BasicCombo {
    public abstract SmartPhone createCombo(String comboype);
}


class ComboCreationLogic extends BasicCombo {
    @Override
    public SmartPhone createCombo(String comboype) {
        SmartPhone combo;
        switch (comboype) {
            case "ram":
                combo = new Samsung();
                break;
            case "camera":
                combo = new Nokia();
                break;
            case "processor":
                combo = new Huawei();
                break;
            default:
                throw new IllegalArgumentException("No such product Specification exitsts.");
        }
        combo.ram();
        combo.Camera();
        combo.processor();
        return combo;
    }
}