/**
 * @NAME: Collague
 * @USER: DaHuangGO
 * @DATE: 2022/12/13
 * @TIME: 1:55
 * @YEAR: 2022
 * @MONTH: 12
 * @DAY: 13
 * 抽象类
 */
public abstract class Colleague {
    protected Mediator mediator;

    public Colleague(Mediator mediator) {
        this.mediator = mediator;
    }
}
