package defpackage;

import defpackage.dl2;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.util.List;
import java.util.ListIterator;

/* JADX INFO: loaded from: classes.dex */
public abstract class zl2<D extends dl2> {
    public dm2 a;
    public boolean b;

    @Target({ElementType.TYPE, ElementType.ANNOTATION_TYPE})
    @Retention(RetentionPolicy.RUNTIME)
    public @interface CQf {
        String value();
    }

    public static final class F1 extends cx1 implements j81<kk2, kk2> {
        public final /* synthetic */ zl2<D> w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public F1(zl2<D> zl2Var, sl2 sl2Var, QnHx qnHx) {
            super(1);
            this.w = zl2Var;
        }

        @Override // defpackage.j81
        public final kk2 invoke(kk2 kk2Var) {
            kk2 kk2VarA = kk2Var;
            dl2 dl2Var = kk2VarA.x;
            if (!(dl2Var instanceof dl2)) {
                dl2Var = null;
            }
            if (dl2Var == null) {
                return null;
            }
            zl2<D> zl2Var = this.w;
            dl2 dl2VarC = zl2Var.c(dl2Var);
            if (dl2VarC == null) {
                kk2VarA = null;
            } else if (!ur1.a(dl2VarC, dl2Var)) {
                kk2VarA = zl2Var.b().a(dl2VarC, dl2VarC.b(kk2VarA.y));
            }
            return kk2VarA;
        }
    }

    public interface QnHx {
    }

    public abstract D a();

    public final dm2 b() {
        dm2 dm2Var = this.a;
        if (dm2Var != null) {
            return dm2Var;
        }
        throw new IllegalStateException("You cannot access the Navigator's state until the Navigator is attached".toString());
    }

    public dl2 c(dl2 dl2Var) {
        return dl2Var;
    }

    public void d(List<kk2> list, sl2 sl2Var, QnHx qnHx) {
        jx0.QnHx qnHx2 = new jx0.QnHx(new jx0(new q95(new uu(list), new F1(this, sl2Var, qnHx)), false, ja4.w));
        while (qnHx2.hasNext()) {
            b().e((kk2) qnHx2.next());
        }
    }

    public void e(kk2 kk2Var, boolean z) {
        List list = (List) b().e.getValue();
        if (!list.contains(kk2Var)) {
            throw new IllegalStateException(("popBackStack was called with " + kk2Var + " which does not exist in back stack " + list).toString());
        }
        ListIterator listIterator = list.listIterator(list.size());
        kk2 kk2Var2 = null;
        while (f()) {
            kk2Var2 = (kk2) listIterator.previous();
            if (ur1.a(kk2Var2, kk2Var)) {
                break;
            }
        }
        if (kk2Var2 != null) {
            b().c(kk2Var2, z);
        }
    }

    public boolean f() {
        return true;
    }
}
