package defpackage;

import android.content.Context;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
public final class ne0 extends za5 {
    public og3<ya5> A;
    public og3<Executor> w = sm0.a(ev0.QnHx.a);
    public dp1 x;
    public og3 y;
    public og3<y14> z;

    public ne0(Context context) {
        if (context == null) {
            throw new NullPointerException("instance cannot be null");
        }
        dp1 dp1Var = new dp1(context);
        this.x = dp1Var;
        this.y = sm0.a(new be2(dp1Var, new mc0(dp1Var)));
        dp1 dp1Var2 = this.x;
        og3<y14> og3VarA = sm0.a(new ab5(ru0.QnHx.a, new s54(dp1Var2), new pu0(dp1Var2), 1));
        this.z = og3VarA;
        l54 l54Var = new l54();
        dp1 dp1Var3 = this.x;
        m54 m54Var = new m54(dp1Var3, og3VarA, l54Var);
        og3<Executor> og3Var = this.w;
        og3 og3Var2 = this.y;
        this.A = sm0.a(new ab5(new sh0(og3Var, og3Var2, m54Var, og3VarA, og3VarA), new oe5(dp1Var3, og3Var2, og3VarA, m54Var, og3Var, og3VarA, og3VarA), new mn5(og3Var, og3VarA, m54Var, og3VarA), 0));
    }
}
