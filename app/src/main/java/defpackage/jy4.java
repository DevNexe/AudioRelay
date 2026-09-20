package defpackage;

import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class jy4 implements nz0<Map<Float, Object>> {
    public final /* synthetic */ Object w;
    public final /* synthetic */ iy4<Object> x;
    public final /* synthetic */ Ah<Float> y;

    @if0(c = "androidx.compose.material.SwipeableState$animateTo$2", f = "Swipeable.kt", l = {335}, m = "emit")
    public static final class QnHx extends b90 {
        public Map A;
        public /* synthetic */ Object B;
        public int D;
        public jy4 z;

        public QnHx(z80<? super QnHx> z80Var) {
            super(z80Var);
        }

        @Override // defpackage.m8
        public final Object i(Object obj) {
            this.B = obj;
            this.D |= Integer.MIN_VALUE;
            return jy4.this.f(null, this);
        }
    }

    public jy4(Object obj, iy4<Object> iy4Var, Ah<Float> ah) {
        this.w = obj;
        this.x = iy4Var;
        this.y = ah;
    }

    /* JADX WARN: Code duplicated, block: B:28:0x0080  */
    /* JADX WARN: Code duplicated, block: B:30:0x0099  */
    /* JADX WARN: Code duplicated, block: B:31:0x009b  */
    /* JADX WARN: Code duplicated, block: B:36:0x00b8  */
    /* JADX WARN: Code duplicated, block: B:46:0x00f1  */
    /* JADX WARN: Code duplicated, block: B:48:0x010a  */
    /* JADX WARN: Code duplicated, block: B:49:0x010c  */
    /* JADX WARN: Code duplicated, block: B:54:0x0129  */
    /* JADX WARN: Code duplicated, block: B:60:0x009e A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:63:0x007a A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:65:0x010f A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:68:0x00eb A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.nz0
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final Object f(Map<Float, Object> map, z80<? super sd5> z80Var) throws Throwable {
        QnHx qnHx;
        jy4 jy4Var;
        float fFloatValue;
        LinkedHashMap linkedHashMap;
        Object objI0;
        iy4<Object> iy4Var;
        boolean z;
        float fFloatValue2;
        LinkedHashMap linkedHashMap2;
        Object objI1;
        iy4<Object> iy4Var2;
        boolean z2;
        if (z80Var instanceof QnHx) {
            qnHx = (QnHx) z80Var;
            int i = qnHx.D;
            if ((i & Integer.MIN_VALUE) != 0) {
                qnHx.D = i - Integer.MIN_VALUE;
            } else {
                qnHx = new QnHx(z80Var);
            }
        } else {
            qnHx = new QnHx(z80Var);
        }
        Object obj = qnHx.B;
        va0 va0Var = va0.COROUTINE_SUSPENDED;
        int i2 = qnHx.D;
        if (i2 != 0) {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            map = qnHx.A;
            jy4Var = qnHx.z;
            try {
                C0239D.H(obj);
                fFloatValue2 = ((Number) jy4Var.x.g.getValue()).floatValue();
                linkedHashMap2 = new LinkedHashMap();
                for (Map.Entry<Float, Object> entry : map.entrySet()) {
                    if (Math.abs(entry.getKey().floatValue() - fFloatValue2) < 0.5f) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    if (z2) {
                        linkedHashMap2.put(entry.getKey(), entry.getValue());
                    }
                }
                objI1 = wu.I0(linkedHashMap2.values());
                iy4Var2 = jy4Var.x;
                if (objI1 == null) {
                    objI1 = iy4Var2.b();
                }
                iy4Var2.d(objI1);
                return sd5.a;
            } catch (Throwable th) {
                th = th;
                fFloatValue = ((Number) jy4Var.x.g.getValue()).floatValue();
                linkedHashMap = new LinkedHashMap();
                for (Map.Entry<Float, Object> entry2 : map.entrySet()) {
                    if (Math.abs(entry2.getKey().floatValue() - fFloatValue) < 0.5f) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (z) {
                        linkedHashMap.put(entry2.getKey(), entry2.getValue());
                    }
                }
                objI0 = wu.I0(linkedHashMap.values());
                iy4Var = jy4Var.x;
                if (objI0 == null) {
                    objI0 = iy4Var.b();
                }
                iy4Var.d(objI0);
                throw th;
            }
        }
        C0239D.H(obj);
        try {
            Float fC = fXUx.c(this.w, map);
            if (fC == null) {
                throw new IllegalArgumentException("The target value must have an associated anchor.".toString());
            }
            iy4<Object> iy4Var3 = this.x;
            float fFloatValue3 = fC.floatValue();
            Ah<Float> ah = this.y;
            qnHx.z = this;
            qnHx.A = map;
            qnHx.D = 1;
            if (iy4Var3.a(fFloatValue3, ah, qnHx) == va0Var) {
                return va0Var;
            }
            jy4Var = this;
            fFloatValue2 = ((Number) jy4Var.x.g.getValue()).floatValue();
            linkedHashMap2 = new LinkedHashMap();
            while (r9.hasNext()) {
                if (Math.abs(entry.getKey().floatValue() - fFloatValue2) < 0.5f) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (z2) {
                    linkedHashMap2.put(entry.getKey(), entry.getValue());
                }
            }
            objI1 = wu.I0(linkedHashMap2.values());
            iy4Var2 = jy4Var.x;
            if (objI1 == null) {
                objI1 = iy4Var2.b();
            }
            iy4Var2.d(objI1);
            return sd5.a;
        } catch (Throwable th2) {
            th = th2;
            jy4Var = this;
            fFloatValue = ((Number) jy4Var.x.g.getValue()).floatValue();
            linkedHashMap = new LinkedHashMap();
            while (r9.hasNext()) {
                if (Math.abs(entry2.getKey().floatValue() - fFloatValue) < 0.5f) {
                    z = true;
                } else {
                    z = false;
                }
                if (z) {
                    linkedHashMap.put(entry2.getKey(), entry2.getValue());
                }
            }
            objI0 = wu.I0(linkedHashMap.values());
            iy4Var = jy4Var.x;
            if (objI0 == null) {
                objI0 = iy4Var.b();
            }
            iy4Var.d(objI0);
            throw th;
        }
    }
}
