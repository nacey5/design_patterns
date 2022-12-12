/**
 * @NAME: Mediator
 * @USER: DaHuangGO
 * @DATE: 2022/12/13
 * @TIME: 1:54
 * @YEAR: 2022
 * @MONTH: 12
 * @DAY: 13
 * 抽象中介者类
 */
public interface Mediator {
    public abstract void send(String message, Colleague colleague);
}
