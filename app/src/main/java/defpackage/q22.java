package defpackage;

import android.content.Context;

/* JADX INFO: loaded from: classes3.dex */
public final class q22 {

    public interface QnHx<T> {
        String d(Context context);
    }

    public static ry<?> a(String str, String str2) {
        t3 t3Var = new t3(str, str2);
        ry.QnHx qnHxA = ry.a(o22.class);
        qnHxA.d = 1;
        qnHxA.e = new oy(t3Var, 0);
        return qnHxA.b();
    }

    public static ry<?> b(final String str, final QnHx<Context> qnHx) {
        ry.QnHx qnHxA = ry.a(o22.class);
        qnHxA.d = 1;
        qnHxA.a(new kj0(1, 0, Context.class));
        qnHxA.e = new ez() { // from class: p22
            @Override // defpackage.ez
            public final Object a(cq3 cq3Var) {
                return new t3(str, qnHx.d((Context) cq3Var.d(Context.class)));
            }
        };
        return qnHxA.b();
    }
}
