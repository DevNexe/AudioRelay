package defpackage;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public final class ky4 implements nz0<Map<Float, Object>> {
    public final /* synthetic */ iy4<Object> w;
    public final /* synthetic */ float x;

    public ky4(iy4<Object> iy4Var, float f) {
        this.w = iy4Var;
        this.x = f;
    }

    /* JADX WARN: Code duplicated, block: B:37:0x00eb A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:38:0x00ed  */
    /* JADX WARN: Code duplicated, block: B:52:0x0142  */
    /* JADX WARN: Code duplicated, block: B:54:0x014e  */
    /* JADX WARN: Code duplicated, block: B:69:0x0191  */
    /* JADX WARN: Code duplicated, block: B:81:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.nz0
    public final Object f(Map<Float, Object> map, z80 z80Var) throws Throwable {
        int i;
        List listM;
        List listSingletonList;
        int size;
        float fFloatValue;
        Object obj;
        va0 va0Var;
        Object objA;
        float fFloatValue2;
        Map<Float, Object> map2 = map;
        iy4<Object> iy4Var = this.w;
        float fFloatValue3 = fXUx.c(iy4Var.b(), map2).floatValue();
        float fFloatValue4 = ((Number) iy4Var.e.getValue()).floatValue();
        Set<Float> setKeySet = map2.keySet();
        x81 x81Var = (x81) iy4Var.m.getValue();
        float fFloatValue5 = ((Number) iy4Var.n.getValue()).floatValue();
        Set<Float> set = setKeySet;
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = set.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            Object next = it.next();
            Map<Float, Object> map3 = map2;
            x81 x81Var2 = x81Var;
            float f = fFloatValue5;
            if (((double) ((Number) next).floatValue()) <= ((double) fFloatValue4) + 0.001d) {
                arrayList.add(next);
            }
            x81Var = x81Var2;
            map2 = map3;
            fFloatValue5 = f;
        }
        Map<Float, Object> map4 = map2;
        x81 x81Var3 = x81Var;
        float f2 = fFloatValue5;
        Float fQ0 = wu.Q0(arrayList);
        ArrayList arrayList2 = new ArrayList();
        for (Object obj2 : set) {
            if (((double) ((Number) obj2).floatValue()) >= ((double) fFloatValue4) - 0.001d) {
                arrayList2.add(obj2);
            }
        }
        Float fR0 = wu.R0(arrayList2);
        if (fQ0 == null) {
            listSingletonList = fR0 != null ? Collections.singletonList(fR0) : cs0.w;
        } else {
            if (fR0 != null) {
                if (fQ0.floatValue() == fR0.floatValue()) {
                    listSingletonList = Collections.singletonList(fQ0);
                } else {
                    i = 1;
                    listM = ps0.M(fQ0, fR0);
                }
                size = listM.size();
                if (size != 0) {
                    if (size != i) {
                        fFloatValue = ((Number) listM.get(0)).floatValue();
                        fFloatValue2 = ((Number) listM.get(i)).floatValue();
                        float f3 = this.x;
                        if (fFloatValue3 <= fFloatValue4 ? f3 > (-f2) && fFloatValue4 > ((Number) x81Var3.invoke(Float.valueOf(fFloatValue2), Float.valueOf(fFloatValue))).floatValue() : f3 >= f2 || fFloatValue4 >= ((Number) x81Var3.invoke(Float.valueOf(fFloatValue), Float.valueOf(fFloatValue2))).floatValue()) {
                        }
                    } else {
                        fFloatValue2 = ((Number) listM.get(0)).floatValue();
                    }
                    fFloatValue = fFloatValue2;
                } else {
                    fFloatValue = fFloatValue3;
                }
                obj = map4.get(new Float(fFloatValue));
                va0Var = va0.COROUTINE_SUSPENDED;
                if (obj == null && iy4Var.b.invoke(obj).booleanValue()) {
                    Object objA2 = iy4Var.j.a(new jy4(obj, iy4Var, iy4Var.a), z80Var);
                    if (objA2 != va0Var) {
                        objA2 = sd5.a;
                    }
                    return objA2 == va0Var ? objA2 : sd5.a;
                }
                objA = iy4Var.a(fFloatValue3, iy4Var.a, z80Var);
                if (objA == va0Var) {
                    return objA;
                }
                return sd5.a;
            }
            listSingletonList = Collections.singletonList(fQ0);
        }
        listM = listSingletonList;
        i = 1;
        size = listM.size();
        if (size != 0) {
            if (size != i) {
                fFloatValue = ((Number) listM.get(0)).floatValue();
                fFloatValue2 = ((Number) listM.get(i)).floatValue();
                float f4 = this.x;
                if (fFloatValue3 <= fFloatValue4) {
                }
            } else {
                fFloatValue2 = ((Number) listM.get(0)).floatValue();
            }
            fFloatValue = fFloatValue2;
        } else {
            fFloatValue = fFloatValue3;
        }
        obj = map4.get(new Float(fFloatValue));
        va0Var = va0.COROUTINE_SUSPENDED;
        if (obj == null) {
        }
        objA = iy4Var.a(fFloatValue3, iy4Var.a, z80Var);
        if (objA == va0Var) {
            return objA;
        }
        return sd5.a;
    }
}
