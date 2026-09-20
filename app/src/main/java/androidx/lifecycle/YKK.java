package androidx.lifecycle;

import defpackage.c32;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes.dex */
public abstract class YKK {
    public final AtomicReference<Object> a = new AtomicReference<>();

    public enum CQf {
        ON_CREATE,
        ON_START,
        ON_RESUME,
        ON_PAUSE,
        ON_STOP,
        ON_DESTROY,
        ON_ANY;

        public final F1 a() {
            switch (QnHx.b[ordinal()]) {
                case 1:
                case 2:
                    return F1.CREATED;
                case 3:
                case 4:
                    return F1.STARTED;
                case 5:
                    return F1.RESUMED;
                case 6:
                    return F1.DESTROYED;
                default:
                    throw new IllegalArgumentException(this + " has no target state");
            }
        }
    }

    public enum F1 {
        DESTROYED,
        INITIALIZED,
        CREATED,
        STARTED,
        RESUMED;

        public final boolean a(F1 f1) {
            return compareTo(f1) >= 0;
        }
    }

    public static /* synthetic */ class QnHx {
        public static final /* synthetic */ int[] a;
        public static final /* synthetic */ int[] b;

        static {
            int[] iArr = new int[CQf.values().length];
            b = iArr;
            try {
                iArr[CQf.ON_CREATE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                b[CQf.ON_STOP.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                b[CQf.ON_START.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                b[CQf.ON_PAUSE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                b[CQf.ON_RESUME.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                b[CQf.ON_DESTROY.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                b[CQf.ON_ANY.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            int[] iArr2 = new int[F1.values().length];
            a = iArr2;
            try {
                iArr2[2] = 1;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                a[3] = 2;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                a[4] = 3;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                a[0] = 4;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                a[1] = 5;
            } catch (NoSuchFieldError unused12) {
            }
        }
    }

    public abstract void a(c32 c32Var);

    public abstract F1 b();

    public abstract void c(c32 c32Var);
}
