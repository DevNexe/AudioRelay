package defpackage;

import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes3.dex */
public final class j54 {
    public static final c54 a = m14.a(new T23());
    public static final c54 b;
    public static final c54 c;
    public static final k95 d;

    public static final class CQf implements Callable<c54> {
        @Override // java.util.concurrent.Callable
        public final c54 call() {
            return QnHx.a;
        }
    }

    public static final class F1 implements Callable<c54> {
        @Override // java.util.concurrent.Callable
        public final c54 call() {
            return LPt8Fixed.a;
        }
    }

    public static final class LPt8Fixed {
        public static final es1 a = new es1();
    }

    public static final class NUlFixed {
        public static final jo2 a = new jo2();
    }

    public static final class QnHx {
        public static final z40 a = new z40();
    }

    public static final class T23 implements Callable<c54> {
        @Override // java.util.concurrent.Callable
        public final c54 call() {
            return auxFixed.a;
        }
    }

    public static final class YKK implements Callable<c54> {
        @Override // java.util.concurrent.Callable
        public final c54 call() {
            return NUlFixed.a;
        }
    }

    public static final class auxFixed {
        public static final ql4 a = new ql4();
    }

    static {
        c54 c54VarA;
        c54 c54VarA2;
        CQf cQf = new CQf();
        i91<? super Callable<c54>, ? extends c54> i91Var = m14.b;
        if (i91Var == null) {
            c54VarA = m14.a(cQf);
        } else {
            try {
                c54 c54VarApply = i91Var.apply(cQf);
                mq2.b(c54VarApply, "Scheduler Callable result can't be null");
                c54VarA = c54VarApply;
            } catch (Throwable th) {
                throw uu0.d(th);
            }
        }
        b = c54VarA;
        F1 f1 = new F1();
        i91<? super Callable<c54>, ? extends c54> i91Var2 = m14.c;
        if (i91Var2 == null) {
            c54VarA2 = m14.a(f1);
        } else {
            try {
                c54 c54VarApply2 = i91Var2.apply(f1);
                mq2.b(c54VarApply2, "Scheduler Callable result can't be null");
                c54VarA2 = c54VarApply2;
            } catch (Throwable th2) {
                throw uu0.d(th2);
            }
        }
        c = c54VarA2;
        d = k95.b;
        m14.a(new YKK());
    }
}
