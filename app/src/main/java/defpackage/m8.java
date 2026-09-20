package defpackage;

import com.unity3d.ads.metadata.MediationMetaData;
import java.io.Serializable;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes3.dex */
public abstract class m8 implements z80<Object>, wa0, Serializable {
    public final z80<Object> w;

    public m8(z80<Object> z80Var) {
        this.w = z80Var;
    }

    public z80<sd5> a(Object obj, z80<?> z80Var) {
        throw new UnsupportedOperationException("create(Any?;Continuation) has not been overridden");
    }

    public StackTraceElement h() {
        int iIntValue;
        String strC;
        if0 if0Var = (if0) getClass().getAnnotation(if0.class);
        String str = null;
        if (if0Var == null) {
            return null;
        }
        int iV = if0Var.v();
        if (iV > 1) {
            throw new IllegalStateException(("Debug metadata version mismatch. Expected: 1, got " + iV + ". Please update the Kotlin standard library.").toString());
        }
        try {
            Field declaredField = getClass().getDeclaredField("label");
            declaredField.setAccessible(true);
            Object obj = declaredField.get(this);
            Integer num = obj instanceof Integer ? (Integer) obj : null;
            iIntValue = (num != null ? num.intValue() : 0) - 1;
        } catch (Exception unused) {
            iIntValue = -1;
        }
        int i = iIntValue >= 0 ? if0Var.l()[iIntValue] : -1;
        xg2.QnHx qnHx = xg2.b;
        xg2.QnHx qnHx2 = xg2.a;
        if (qnHx == null) {
            try {
                xg2.QnHx qnHx3 = new xg2.QnHx(Class.class.getDeclaredMethod("getModule", new Class[0]), getClass().getClassLoader().loadClass("java.lang.Module").getDeclaredMethod("getDescriptor", new Class[0]), getClass().getClassLoader().loadClass("java.lang.module.ModuleDescriptor").getDeclaredMethod(MediationMetaData.KEY_NAME, new Class[0]));
                xg2.b = qnHx3;
                qnHx = qnHx3;
            } catch (Exception unused2) {
                xg2.b = qnHx2;
                qnHx = qnHx2;
            }
        }
        if (qnHx != qnHx2) {
            Method method = qnHx.a;
            Object objInvoke = method != null ? method.invoke(getClass(), new Object[0]) : null;
            if (objInvoke != null) {
                Method method2 = qnHx.b;
                Object objInvoke2 = method2 != null ? method2.invoke(objInvoke, new Object[0]) : null;
                if (objInvoke2 != null) {
                    Method method3 = qnHx.c;
                    Object objInvoke3 = method3 != null ? method3.invoke(objInvoke2, new Object[0]) : null;
                    if (objInvoke3 instanceof String) {
                        str = (String) objInvoke3;
                    }
                }
            }
        }
        if (str == null) {
            strC = if0Var.c();
        } else {
            strC = str + '/' + if0Var.c();
        }
        return new StackTraceElement(strC, if0Var.m(), if0Var.f(), i);
    }

    public abstract Object i(Object obj);

    public void j() {
    }

    @Override // defpackage.wa0
    public wa0 k() {
        z80<Object> z80Var = this.w;
        if (z80Var instanceof wa0) {
            return (wa0) z80Var;
        }
        return null;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("Continuation at ");
        Object objH = h();
        if (objH == null) {
            objH = getClass().getName();
        }
        sb.append(objH);
        return sb.toString();
    }

    @Override // defpackage.z80
    public final void x(Object obj) {
        z80<Object> z80Var = this;
        while (true) {
            m8 m8Var = (m8) z80Var;
            z80<Object> z80Var2 = m8Var.w;
            try {
                obj = m8Var.i(obj);
                if (obj == va0.COROUTINE_SUSPENDED) {
                    return;
                }
            } catch (Throwable th) {
                obj = new fq3.QnHx(th);
            }
            m8Var.j();
            if (!(z80Var2 instanceof m8)) {
                z80Var2.x(obj);
                return;
            }
            z80Var = z80Var2;
        }
    }
}
