package FactoryMethod;

public class WindowsButton implements Button {
    @Override
    public void render() {
        System.out.println("Рендерю кнопку для Windows");
        onClick();
    }

    @Override
    public void onClick() {
        System.out.println("Происходит действие для Windows при нажатии этой кнопки");
    }
}
