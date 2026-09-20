package defpackage;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import kotlinx.coroutines.flow.internal.AbortFlowException;

/* JADX INFO: loaded from: classes3.dex */
public final class YKK implements qf6 {
    public static ej1 C;
    public static ej1 D;
    public static ej1 E;
    public static final py4 w = new py4("EMPTY");
    public static final py4 x = new py4("OFFER_SUCCESS");
    public static final py4 y = new py4("OFFER_FAILED");
    public static final py4 z = new py4("POLL_FAILED");
    public static final py4 A = new py4("ENQUEUE_FAILED");
    public static final py4 B = new py4("ON_CLOSE_HANDLER_INVOKED");
    public static final byte[] F = new byte[0];
    public static final /* synthetic */ YKK G = new YKK();

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static final void a(nz0 nz0Var, Object obj, z80 z80Var) throws Throwable {
        d01 d01Var;
        if (z80Var instanceof d01) {
            d01Var = (d01) z80Var;
            int i = d01Var.B;
            if ((i & Integer.MIN_VALUE) != 0) {
                d01Var.B = i - Integer.MIN_VALUE;
            } else {
                d01Var = new d01(z80Var);
            }
        } else {
            d01Var = new d01(z80Var);
        }
        Object obj2 = d01Var.A;
        va0 va0Var = va0.COROUTINE_SUSPENDED;
        int i2 = d01Var.B;
        if (i2 == 0) {
            C0239D.H(obj2);
            d01Var.z = nz0Var;
            d01Var.B = 1;
            if (nz0Var.f(obj, d01Var) == va0Var) {
                return;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            nz0Var = d01Var.z;
            C0239D.H(obj2);
        }
        throw new AbortFlowException(nz0Var);
    }

    public static final void b(qn1 qn1Var, oq oqVar) {
        if (oqVar == qn1Var) {
            return;
        }
        int i = oqVar.c;
        int i2 = oqVar.b;
        if (!(i > i2)) {
            qn1Var.f(oqVar);
            return;
        }
        int i3 = oqVar.e;
        int i4 = oqVar.f;
        if (i4 - i3 >= 8) {
            qn1Var.z = i2;
            return;
        }
        oq oqVarG = oqVar.g();
        if (oqVarG == null) {
            qn1Var.i(oqVar);
            return;
        }
        int i5 = oqVar.c - oqVar.b;
        int iMin = Math.min(i5, 8 - (i4 - oqVar.e));
        if (oqVarG.d < iMin) {
            qn1Var.i(oqVar);
            return;
        }
        oqVarG.d(oqVarG.b - iMin);
        if (i5 > iMin) {
            oqVar.e = i4;
            qn1Var.A = oqVar.c;
            qn1Var.w(qn1Var.B + ((long) iMin));
        } else {
            qn1Var.y(oqVarG);
            qn1Var.w(qn1Var.B - ((long) ((oqVarG.c - oqVarG.b) - iMin)));
            oqVar.f();
            oqVar.i(qn1Var.w);
        }
    }

    /* JADX WARN: Code duplicated, block: B:39:0x00ae A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:40:0x00af  */
    /* JADX WARN: Instruction removed from duplicated block: B:40:0x00af, please report this as an issue */
    public static Method c(Class cls, String str, Object... objArr) throws NoSuchMethodException {
        Method methodD;
        Method method = null;
        try {
            try {
                int length = objArr.length;
                int iCeil = length == 0 ? 1 : (int) Math.ceil(((double) (length + 0)) / 15.0d);
                kr4 kr4Var = new kr4(4);
                ArrayList arrayList = kr4Var.a;
                ArrayList arrayList2 = new ArrayList();
                int length2 = objArr.length;
                for (int i = 0; i < length2; i++) {
                    Object obj = objArr[i];
                    Class<?> cls2 = obj != null ? obj.getClass() : null;
                    if (cls2 != null) {
                        arrayList2.add(cls2);
                    }
                }
                Object[] array = arrayList2.toArray(new Class[0]);
                if (array == null) {
                    throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
                }
                kr4Var.a(array);
                arrayList.add(g30.class);
                Class cls3 = Integer.TYPE;
                arrayList.add(cls3);
                pp1 pp1Var = new pp1(0, iCeil);
                ArrayList arrayList3 = new ArrayList(mu.w0(pp1Var, 10));
                op1 it = pp1Var.iterator();
                while (it.y) {
                    it.nextInt();
                    arrayList3.add(cls3);
                }
                Object[] array2 = arrayList3.toArray(new Class[0]);
                if (array2 == null) {
                    throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
                }
                kr4Var.a(array2);
                methodD = d(cls, str, (Class[]) arrayList.toArray(new Class[arrayList.size()]));
                if (methodD != null) {
                    return methodD;
                }
                throw new NoSuchMethodException(cls.getName() + '.' + str);
            } catch (ReflectiveOperationException unused) {
                methodD = method;
            }
        } catch (ReflectiveOperationException unused2) {
            for (Method method2 : cls.getDeclaredMethods()) {
                if (ur1.a(method2.getName(), str)) {
                    method = method2;
                    break;
                }
            }
            methodD = method;
            if (methodD != null) {
                return methodD;
            }
            throw new NoSuchMethodException(cls.getName() + '.' + str);
        }
    }

    /* JADX WARN: Code duplicated, block: B:23:0x0068  */
    /* JADX WARN: Code duplicated, block: B:26:0x006c  */
    /* JADX WARN: Code duplicated, block: B:32:0x0076 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:33:0x0077  */
    public static Method d(Class cls, String str, Class... clsArr) throws NoSuchMethodException {
        boolean z2;
        boolean z3;
        boolean z4;
        Class<?>[] clsArr2 = (Class[]) Arrays.copyOf(clsArr, clsArr.length);
        for (Method method : cls.getDeclaredMethods()) {
            if (ur1.a(str, method.getName())) {
                Class<?>[] parameterTypes = method.getParameterTypes();
                if (parameterTypes.length == clsArr2.length) {
                    ArrayList arrayList = new ArrayList(parameterTypes.length);
                    int length = parameterTypes.length;
                    int i = 0;
                    int i2 = 0;
                    while (i < length) {
                        arrayList.add(Boolean.valueOf(parameterTypes[i].isAssignableFrom(clsArr2[i2])));
                        i++;
                        i2++;
                    }
                    if (arrayList.isEmpty()) {
                        z4 = true;
                        break;
                    }
                    Iterator it = arrayList.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            z4 = true;
                            break;
                        }
                        if (!((Boolean) it.next()).booleanValue()) {
                            z4 = false;
                            break;
                        }
                    }
                    if (z4) {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                } else {
                    z3 = false;
                }
                z2 = z3;
            }
            if (z2) {
                if (method != null) {
                    return method;
                }
                throw new NoSuchMethodException(rz.a(str, " not found"));
            }
        }
        method = null;
        if (method != null) {
            return method;
        }
        throw new NoSuchMethodException(rz.a(str, " not found"));
    }

    public static void e(String str, String str2, g30 g30Var, Object... objArr) throws ClassNotFoundException {
        try {
            Class<?> cls = Class.forName(str);
            Method methodC = c(cls, str2, Arrays.copyOf(objArr, objArr.length));
            methodC.setAccessible(true);
            if (Modifier.isStatic(methodC.getModifiers())) {
                f(methodC, null, g30Var, Arrays.copyOf(objArr, objArr.length));
            } else {
                f(methodC, cls.getConstructor(new Class[0]).newInstance(new Object[0]), g30Var, Arrays.copyOf(objArr, objArr.length));
            }
        } catch (ReflectiveOperationException e) {
            throw new ClassNotFoundException("Composable Method '" + str + '.' + str2 + "' not found", e);
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:76:0x00f9  */
    public static void f(Method method, Object obj, g30 g30Var, Object... objArr) throws IllegalAccessException, InvocationTargetException {
        Object objValueOf;
        Class<?>[] parameterTypes = method.getParameterTypes();
        int length = parameterTypes.length - 1;
        if (length < 0) {
            length = -1;
            break;
        }
        while (true) {
            int i = length - 1;
            if (ur1.a(parameterTypes[length], g30.class)) {
                break;
            }
            if (i < 0) {
                length = -1;
                break;
            }
            length = i;
        }
        int i2 = length + 1;
        int iCeil = (length == 0 ? 1 : (int) Math.ceil(((double) ((obj != null ? 1 : 0) + length)) / 15.0d)) + i2;
        int length2 = method.getParameterTypes().length;
        if (!((length2 != iCeil ? (int) Math.ceil(((double) length) / 31.0d) : 0) + iCeil == length2)) {
            throw new IllegalStateException("Check failed.".toString());
        }
        Object[] objArr2 = new Object[length2];
        int i3 = 0;
        while (i3 < length2) {
            if (i3 >= 0 && i3 < length) {
                if (i3 < 0 || i3 > objArr.length - 1) {
                    switch (method.getParameterTypes()[i3].getName()) {
                        case "double":
                            objValueOf = Double.valueOf(0.0d);
                            break;
                        case "int":
                            objValueOf = 0;
                            break;
                        case "byte":
                            objValueOf = (byte) 0;
                            break;
                        case "char":
                            objValueOf = '0';
                            break;
                        case "long":
                            objValueOf = 0L;
                            break;
                        case "boolean":
                            objValueOf = Boolean.FALSE;
                            break;
                        case "float":
                            objValueOf = Float.valueOf(0.0f);
                            break;
                        case "short":
                            objValueOf = (short) 0;
                            break;
                        default:
                            objValueOf = null;
                            break;
                    }
                } else {
                    objValueOf = objArr[i3];
                }
            } else if (i3 == length) {
                objValueOf = g30Var;
            } else {
                if (i2 <= i3 && i3 < iCeil) {
                    objValueOf = 0;
                } else {
                    if (!(iCeil <= i3 && i3 < length2)) {
                        throw new IllegalStateException("Unexpected index".toString());
                    }
                    objValueOf = 2097151;
                }
            }
            objArr2[i3] = objValueOf;
            i3++;
        }
        method.invoke(obj, Arrays.copyOf(objArr2, length2));
    }

    public static final oq g(qn1 qn1Var, int i) {
        return qn1Var.o(i, qn1Var.m());
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final oq h(qn1 qn1Var, oq oqVar) {
        if (oqVar != qn1Var) {
            return qn1Var.f(oqVar);
        }
        if ((qn1Var.z == qn1Var.A && qn1Var.B == 0) ? false : true) {
            return (oq) qn1Var;
        }
        return null;
    }

    public static final oq i(pw2 pw2Var, int i, oq oqVar) {
        if (oqVar != null) {
            pw2Var.b();
        }
        return pw2Var.m(i);
    }

    @Override // defpackage.qf6
    public Object zza() {
        List list = lg6.a;
        return Integer.valueOf((int) b67.x.zza().zzw());
    }
}
