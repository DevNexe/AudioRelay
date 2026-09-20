package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class ib {
    public static final ry4 a = new ry4(QnHx.w);

    public static final class QnHx extends cx1 implements h81<t52> {
        public static final QnHx w = new QnHx();

        public QnHx() {
            super(0);
        }

        @Override // defpackage.h81
        public final t52 invoke() {
            int i;
            int i2 = u52.a;
            t52 t52VarD = u52.d(io.ktor.utils.io.jvm.javaio.QnHx.class.getName());
            if (u52.d) {
                pf5.QnHx qnHx = pf5.a;
                Class<?> cls = null;
                if (qnHx == null) {
                    if (pf5.b) {
                        qnHx = null;
                    } else {
                        try {
                            qnHx = new pf5.QnHx();
                        } catch (SecurityException unused) {
                            qnHx = null;
                        }
                        pf5.a = qnHx;
                        pf5.b = true;
                    }
                }
                if (qnHx != null) {
                    Class<?>[] classContext = qnHx.getClassContext();
                    String name = pf5.class.getName();
                    int i3 = 0;
                    while (i3 < classContext.length && !name.equals(classContext[i3].getName())) {
                        i3++;
                    }
                    if (i3 >= classContext.length || (i = i3 + 2) >= classContext.length) {
                        throw new IllegalStateException("Failed to find org.slf4j.helpers.Util or its caller in the stack; this should not happen");
                    }
                    cls = classContext[i];
                }
                if (cls != null && (!cls.isAssignableFrom(io.ktor.utils.io.jvm.javaio.QnHx.class))) {
                    pf5.a(String.format("Detected logger name mismatch. Given name: \"%s\"; computed name: \"%s\".", t52VarD.getName(), cls.getName()));
                    pf5.a("See http://www.slf4j.org/codes.html#loggerNameMismatch for an explanation");
                }
            }
            return t52VarD;
        }
    }
}
