package defpackage;

import java.util.List;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class la implements ba {
    public final /* synthetic */ int w;

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.ba
    public final Object apply(Object obj, Object obj2) {
        boolean z = true;
        switch (this.w) {
            case 0:
                xq0 cQf = (xq0) obj;
                xq0 xq0Var = (xq0) obj2;
                if (cQf instanceof xq0.CQf) {
                    xq0.CQf cQf2 = (xq0.CQf) cQf;
                    if (xq0Var instanceof xq0.CQf) {
                        cQf = new xq0.CQf(new uy2(cQf2.a, ((xq0.CQf) xq0Var).a));
                    } else {
                        if (!(xq0Var instanceof xq0.QnHx)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        cQf = xq0Var;
                    }
                } else if (!(cQf instanceof xq0.QnHx)) {
                    throw new NoWhenBranchMatchedException();
                }
                if (!(cQf instanceof xq0.CQf)) {
                    if (cQf instanceof xq0.QnHx) {
                        return cQf;
                    }
                    throw new NoWhenBranchMatchedException();
                }
                uy2 uy2Var = (uy2) ((xq0.CQf) cQf).a;
                Boolean bool = (Boolean) uy2Var.w;
                Boolean bool2 = (Boolean) uy2Var.x;
                if (!bool.booleanValue() && !bool2.booleanValue()) {
                    z = false;
                }
                return new xq0.CQf(Boolean.valueOf(z));
            case 1:
                Boolean bool3 = (Boolean) obj2;
                if (!((Boolean) obj).booleanValue() && !bool3.booleanValue()) {
                    z = false;
                }
                return Boolean.valueOf(z);
            case 2:
                return new uy2((gq0) obj, (List) obj2);
            default:
                return (nt4) obj;
        }
    }
}
