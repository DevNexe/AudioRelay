package defpackage;

import android.os.Bundle;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Set;
import java.util.concurrent.CancellationException;
import kotlinx.serialization.SerializationException;

/* JADX INFO: loaded from: classes.dex */
public class ddf implements z81, i91, yz2, qf6 {
    public static ej1 w;
    public static final ddf x = new ddf();
    public static final /* synthetic */ ddf y = new ddf();

    public static yw c() {
        return new yw(null);
    }

    public static xw4 d() {
        return new xw4(null);
    }

    public static final void e(StringBuilder sb, Object obj, j81 j81Var) {
        if (j81Var != null) {
            sb.append((CharSequence) j81Var.invoke(obj));
            return;
        }
        if (obj == null ? true : obj instanceof CharSequence) {
            sb.append((CharSequence) obj);
        } else if (obj instanceof Character) {
            sb.append(((Character) obj).charValue());
        } else {
            sb.append((CharSequence) String.valueOf(obj));
        }
    }

    public static final void f(int i) {
        if (!(i >= 1)) {
            throw new IllegalArgumentException(GM.a("Expected positive parallelism level, but got ", i).toString());
        }
    }

    public static final Collection g(Iterable iterable, Iterable iterable2) {
        if (iterable instanceof Set) {
            return (Collection) iterable;
        }
        if (!(iterable instanceof Collection)) {
            return lu.a ? wu.c1(iterable) : wu.e1(iterable);
        }
        if ((iterable2 instanceof Collection) && ((Collection) iterable2).size() < 2) {
            return (Collection) iterable;
        }
        Collection collection = (Collection) iterable;
        return lu.a && collection.size() > 2 && (collection instanceof ArrayList) ? wu.c1(iterable) : collection;
    }

    public static final Boolean h(su1 su1Var) {
        String strA = su1Var.a();
        String[] strArr = uu4.a;
        if (iv4.r(strA, "true")) {
            return Boolean.TRUE;
        }
        if (iv4.r(strA, "false")) {
            return Boolean.FALSE;
        }
        return null;
    }

    public static final int i(int i, int i2, int i3) {
        if (i3 > 0) {
            if (i >= i2) {
                return i2;
            }
            int i4 = i2 % i3;
            if (i4 < 0) {
                i4 += i3;
            }
            int i5 = i % i3;
            if (i5 < 0) {
                i5 += i3;
            }
            int i6 = (i4 - i5) % i3;
            if (i6 < 0) {
                i6 += i3;
            }
            return i2 - i6;
        }
        if (i3 >= 0) {
            throw new IllegalArgumentException("Step is zero.");
        }
        if (i <= i2) {
            return i2;
        }
        int i7 = -i3;
        int i8 = i % i7;
        if (i8 < 0) {
            i8 += i7;
        }
        int i9 = i2 % i7;
        if (i9 < 0) {
            i9 += i7;
        }
        int i10 = (i8 - i9) % i7;
        if (i10 < 0) {
            i10 += i7;
        }
        return i2 + i10;
    }

    public static final void j(la0 la0Var, Throwable th) {
        if (th instanceof CancellationException) {
            return;
        }
        try {
            m14.b(th);
        } catch (Throwable th2) {
            Th.a(th, th2);
            ps0.K(la0Var, th);
        }
    }

    public static final void k(String str, fv1 fv1Var) {
        String strA;
        String str2 = "in the scope of '" + fv1Var.a() + '\'';
        if (str == null) {
            strA = b70.a("Class discriminator was missing and no default polymorphic serializers were registered ", str2);
        } else {
            strA = "Class '" + str + "' is not registered for polymorphic serialization " + str2 + ".\nMark the base class as 'sealed' or register the serializer explicitly.";
        }
        throw new SerializationException(strA);
    }

    @Override // defpackage.yz2
    public void a(qk qkVar, j81 j81Var) {
        j81Var.invoke(qkVar);
    }

    @Override // defpackage.i91
    public Object apply(Object obj) {
        ys1 ys1Var = (ys1) obj;
        at1 at1Var = ys1Var.a;
        if (at1Var != null) {
            int i = BJoY.a[at1Var.ordinal()];
        }
        at1 at1Var2 = ys1Var.c;
        if (at1Var2 != null) {
            int i2 = BJoY.a[at1Var2.ordinal()];
        }
        return new Bs6V(1, 1);
    }

    @Override // defpackage.z81
    public Object b(Object obj, Object obj2, Object obj3) {
        return new Vb5(((w1L) obj).c, 1, ((LpT7Fixed) obj2).a, (Bundle) obj3);
    }

    @Override // defpackage.qf6
    public Object zza() {
        List list = lg6.a;
        return Boolean.valueOf(c87.x.zza().zzo());
    }
}
