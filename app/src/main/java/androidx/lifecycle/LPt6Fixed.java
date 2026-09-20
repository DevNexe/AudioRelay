package androidx.lifecycle;

import android.app.Application;
import defpackage.bi2;
import defpackage.jj5;
import defpackage.lj5;
import defpackage.mj5;
import defpackage.nWE;
import defpackage.nc0;
import java.lang.reflect.InvocationTargetException;

/* JADX INFO: loaded from: classes.dex */
public class LPt6Fixed {
    public final lj5 a;
    public final CQf b;
    public final nc0 c;

    public interface CQf {
        <T extends jj5> T a(Class<T> cls);

        jj5 b(Class cls, bi2 bi2Var);
    }

    public static class F1 implements CQf {
        public static F1 a;

        @Override // androidx.lifecycle.LPt6Fixed.CQf
        public <T extends jj5> T a(Class<T> cls) {
            try {
                return cls.newInstance();
            } catch (IllegalAccessException e) {
                throw new RuntimeException("Cannot create an instance of " + cls, e);
            } catch (InstantiationException e2) {
                throw new RuntimeException("Cannot create an instance of " + cls, e2);
            }
        }

        @Override // androidx.lifecycle.LPt6Fixed.CQf
        public jj5 b(Class cls, bi2 bi2Var) {
            return a(cls);
        }
    }

    public static class LPt8Fixed {
        public void c(jj5 jj5Var) {
        }
    }

    public static class QnHx extends F1 {
        public static QnHx c;
        public final Application b;

        public QnHx(Application application) {
            this.b = application;
        }

        @Override // androidx.lifecycle.LPt6Fixed.F1, androidx.lifecycle.LPt6Fixed.CQf
        public final <T extends jj5> T a(Class<T> cls) {
            Application application = this.b;
            if (application != null) {
                return (T) c(cls, application);
            }
            throw new UnsupportedOperationException("AndroidViewModelFactory constructed with empty constructor works only with create(modelClass: Class<T>, extras: CreationExtras).");
        }

        @Override // androidx.lifecycle.LPt6Fixed.F1, androidx.lifecycle.LPt6Fixed.CQf
        public final jj5 b(Class cls, bi2 bi2Var) {
            if (this.b != null) {
                return a(cls);
            }
            Application application = (Application) bi2Var.a(MZ.a);
            if (application != null) {
                return c(cls, application);
            }
            if (nWE.class.isAssignableFrom(cls)) {
                throw new IllegalArgumentException("CreationExtras must have an application by `APPLICATION_KEY`");
            }
            return super.a(cls);
        }

        public final <T extends jj5> T c(Class<T> cls, Application application) {
            if (!nWE.class.isAssignableFrom(cls)) {
                return (T) super.a(cls);
            }
            try {
                return cls.getConstructor(Application.class).newInstance(application);
            } catch (IllegalAccessException e) {
                throw new RuntimeException("Cannot create an instance of " + cls, e);
            } catch (InstantiationException e2) {
                throw new RuntimeException("Cannot create an instance of " + cls, e2);
            } catch (NoSuchMethodException e3) {
                throw new RuntimeException("Cannot create an instance of " + cls, e3);
            } catch (InvocationTargetException e4) {
                throw new RuntimeException("Cannot create an instance of " + cls, e4);
            }
        }
    }

    public LPt6Fixed(lj5 lj5Var, CQf cQf, nc0 nc0Var) {
        this.a = lj5Var;
        this.b = cQf;
        this.c = nc0Var;
    }

    public final <T extends jj5> T a(Class<T> cls) {
        String canonicalName = cls.getCanonicalName();
        if (canonicalName != null) {
            return (T) b(cls, "androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(canonicalName));
        }
        throw new IllegalArgumentException("Local and anonymous classes can not be ViewModels");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public final jj5 b(Class cls, String str) {
        jj5 jj5VarA;
        lj5 lj5Var = this.a;
        jj5 jj5Var = lj5Var.a.get(str);
        boolean zIsInstance = cls.isInstance(jj5Var);
        CQf cQf = this.b;
        if (zIsInstance) {
            LPt8Fixed lPt8 = cQf instanceof LPt8Fixed ? (LPt8Fixed) cQf : null;
            if (lPt8 != null) {
                lPt8.c(jj5Var);
            }
            if (jj5Var != null) {
                return jj5Var;
            }
            throw new NullPointerException("null cannot be cast to non-null type T of androidx.lifecycle.ViewModelProvider.get");
        }
        bi2 bi2Var = new bi2(this.c);
        bi2Var.b(Xn1.a, str);
        try {
            jj5VarA = cQf.b(cls, bi2Var);
        } catch (AbstractMethodError unused) {
            jj5VarA = cQf.a(cls);
        }
        jj5 jj5VarPut = lj5Var.a.put(str, jj5VarA);
        if (jj5VarPut != null) {
            jj5VarPut.c();
        }
        return jj5VarA;
    }

    public /* synthetic */ LPt6Fixed(lj5 lj5Var, CQf cQf, int i) {
        this(lj5Var, cQf, nc0.QnHx.b);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public LPt6Fixed(mj5 mj5Var, CQf cQf) {
        nc0 nc0VarB;
        lj5 lj5VarM = mj5Var.M();
        if (mj5Var instanceof androidx.lifecycle.LPt8Fixed) {
            nc0VarB = ((androidx.lifecycle.LPt8Fixed) mj5Var).b();
        } else {
            nc0VarB = nc0.QnHx.b;
        }
        this(lj5VarM, cQf, nc0VarB);
    }
}
