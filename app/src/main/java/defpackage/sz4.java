package defpackage;

import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class sz4 implements Callable {
    public final /* synthetic */ uz4 w;
    public final /* synthetic */ String x;
    public final /* synthetic */ c54 y;
    public final /* synthetic */ long z = 5000;

    public /* synthetic */ sz4(uz4 uz4Var, String str, c54 c54Var) {
        this.w = uz4Var;
        this.x = str;
        this.y = c54Var;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        fl3 fl3Var = new fl3();
        String str = this.x;
        tz4 tz4Var = new tz4(str, 0);
        uz4 uz4Var = this.w;
        dw4<rz4> dw4Var = uz4Var.b;
        dw4Var.getClass();
        pr2 pr2Var = new pr2(dw4Var, tz4Var);
        c54 c54Var = this.y;
        vq2 vq2VarW = pr2Var.u(c54Var).w(new ur2(new te0(2, str, uz4Var)).A(c54Var));
        vq2VarW.getClass();
        vq2 vq2VarW2 = new er2(new hr2(vq2VarW), new e14(fl3Var, this.z, c54Var)).w(new ur2(new sc4(3, str, uz4Var)).A(c54Var));
        vq2VarW2.getClass();
        return new hr2(vq2VarW2);
    }
}
