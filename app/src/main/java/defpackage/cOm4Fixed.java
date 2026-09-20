package defpackage;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;

/* JADX INFO: loaded from: classes.dex */
@zl2.CQf("activity")
public class cOm4Fixed extends zl2<QnHx> {
    public final Activity c;

    public static final class CQf extends cx1 implements j81<Context, Context> {
        public static final CQf w = new CQf();

        public CQf() {
            super(1);
        }

        @Override // defpackage.j81
        public final Context invoke(Context context) {
            Context context2 = context;
            if (context2 instanceof ContextWrapper) {
                return ((ContextWrapper) context2).getBaseContext();
            }
            return null;
        }
    }

    public static class QnHx extends dl2 {
        public QnHx(zl2<? extends QnHx> zl2Var) {
            super(zl2Var);
        }

        @Override // defpackage.dl2
        public final boolean equals(Object obj) {
            if (obj == null || !(obj instanceof QnHx) || !super.equals(obj)) {
                return false;
            }
            return ur1.a(null, null);
        }

        @Override // defpackage.dl2
        public final int hashCode() {
            return (((super.hashCode() * 31) + 0) * 31) + 0;
        }

        @Override // defpackage.dl2
        public final String toString() {
            return super.toString();
        }
    }

    public cOm4Fixed(Context context) {
        for (Object obj : ba4.G0(context, CQf.w)) {
            if (((Context) obj) instanceof Activity) {
                this.c = (Activity) obj;
            }
        }
        obj = null;
        this.c = (Activity) obj;
    }

    @Override // defpackage.zl2
    public final dl2 a() {
        return new QnHx(this);
    }

    @Override // defpackage.zl2
    public final dl2 c(dl2 dl2Var) {
        throw new IllegalStateException(ex0.c(new StringBuilder("Destination "), ((QnHx) dl2Var).C, " does not have an Intent set.").toString());
    }

    @Override // defpackage.zl2
    public final boolean f() {
        Activity activity = this.c;
        if (activity == null) {
            return false;
        }
        activity.finish();
        return true;
    }
}
