package defpackage;

import j$.util.Optional;
import j$.util.function.Function;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: classes.dex */
public final class oy3<T1, T2, R> implements ba<T1, T2, R> {
    public final /* synthetic */ ny1 w;

    public oy3(ny1 ny1Var) {
        this.w = ny1Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.ba
    public final R apply(T1 t1, T2 t2) {
        mv2 mv2Var;
        String str;
        String str2;
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        Optional optional = (Optional) t2;
        Object obj = (y73) t1;
        this.w.getClass();
        if (obj instanceof ym5) {
            String str3 = (String) optional.map(new my3(0)).orElse("");
            mv2 mv2Var2 = (mv2) optional.map(new Function() { // from class: ny3
                @Override // j$.util.function.Function
                public final /* synthetic */ Function andThen(Function function) {
                    return Function.CC.$default$andThen(this, function);
                }

                @Override // j$.util.function.Function
                public final Object apply(Object obj2) {
                    return ((yb4) obj2).x;
                }

                @Override // j$.util.function.Function
                public final /* synthetic */ Function compose(Function function) {
                    return Function.CC.$default$compose(this, function);
                }
            }).orElse(null);
            str2 = ((ym5) obj).a().a;
            mv2Var = mv2Var2;
            str = str3;
        } else {
            mv2Var = null;
            str = "";
            str2 = str;
        }
        boolean z5 = obj instanceof y73.CQf;
        if (z5 || (obj instanceof y73.NUlFixed)) {
            z = false;
        } else if (obj instanceof y73.QnHx) {
            z = true;
        } else {
            if (!(obj instanceof y73.LPt8Fixed) && !(obj instanceof y73.F1)) {
                throw new NoWhenBranchMatchedException();
            }
            z = false;
        }
        if (z5 || (obj instanceof y73.NUlFixed) || (obj instanceof y73.QnHx)) {
            z2 = false;
        } else if (obj instanceof y73.LPt8Fixed) {
            z2 = true;
        } else {
            if (!(obj instanceof y73.F1)) {
                throw new NoWhenBranchMatchedException();
            }
            z2 = false;
        }
        if (z5 || (obj instanceof y73.NUlFixed)) {
            z3 = true;
        } else {
            if (!(obj instanceof y73.QnHx) && !(obj instanceof y73.LPt8Fixed) && !(obj instanceof y73.F1)) {
                throw new NoWhenBranchMatchedException();
            }
            z3 = false;
        }
        if (z5 || (obj instanceof y73.NUlFixed) || (obj instanceof y73.QnHx) || (obj instanceof y73.LPt8Fixed)) {
            z4 = false;
        } else {
            if (!(obj instanceof y73.F1)) {
                throw new NoWhenBranchMatchedException();
            }
            z4 = true;
        }
        return (R) new ty3(str, str2, mv2Var, z4, z, z2, z3);
    }
}
