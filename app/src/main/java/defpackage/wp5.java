package defpackage;

import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.IAccountAccessor;
import com.google.android.gms.common.internal.QnHx;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public final class wp5 implements QnHx.F1, jq5 {
    public final com.google.android.gms.common.api.QnHx.NUlFixed a;
    public final Hp<?> b;
    public IAccountAccessor c = null;
    public Set<Scope> d = null;
    public boolean e = false;
    public final /* synthetic */ pa1 f;

    public wp5(pa1 pa1Var, com.google.android.gms.common.api.QnHx.NUlFixed nUl, Hp<?> hp) {
        this.f = pa1Var;
        this.a = nUl;
        this.b = hp;
    }

    @Override // com.google.android.gms.common.internal.QnHx.F1
    public final void a(z50 z50Var) {
        this.f.I.post(new vp5(this, z50Var));
    }

    public final void b(z50 z50Var) {
        tp5 tp5Var = (tp5) this.f.F.get(this.b);
        if (tp5Var != null) {
            oa3.c(tp5Var.I.I);
            com.google.android.gms.common.api.QnHx.NUlFixed nUl = tp5Var.x;
            String name = nUl.getClass().getName();
            String strValueOf = String.valueOf(z50Var);
            StringBuilder sb = new StringBuilder(name.length() + 25 + strValueOf.length());
            sb.append("onSignInFailed for ");
            sb.append(name);
            sb.append(" with ");
            sb.append(strValueOf);
            nUl.disconnect(sb.toString());
            tp5Var.m(z50Var, null);
        }
    }
}
