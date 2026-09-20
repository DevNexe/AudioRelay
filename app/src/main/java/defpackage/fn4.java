package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class fn4 extends cx1 implements j81<Float, Boolean> {
    public final /* synthetic */ j81<Float, sd5> A;
    public final /* synthetic */ rt<Float> w;
    public final /* synthetic */ int x;
    public final /* synthetic */ List<Float> y;
    public final /* synthetic */ float z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public fn4(rt<Float> rtVar, int i, List<Float> list, float f, j81<? super Float, sd5> j81Var) {
        super(1);
        this.w = rtVar;
        this.x = i;
        this.y = list;
        this.z = f;
        this.A = j81Var;
    }

    @Override // defpackage.j81
    public final Boolean invoke(Float f) {
        Object obj;
        float fFloatValue = f.floatValue();
        rt<Float> rtVar = this.w;
        float fN = AY.n(fFloatValue, rtVar.b().floatValue(), rtVar.e().floatValue());
        if (this.x > 0) {
            List<Float> list = this.y;
            ArrayList arrayList = new ArrayList(mu.w0(list, 10));
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(Float.valueOf(C0239D.y(rtVar.b().floatValue(), rtVar.e().floatValue(), ((Number) it.next()).floatValue())));
            }
            Iterator it2 = arrayList.iterator();
            if (it2.hasNext()) {
                Object next = it2.next();
                if (it2.hasNext()) {
                    float fAbs = Math.abs(((Number) next).floatValue() - fN);
                    do {
                        Object next2 = it2.next();
                        float fAbs2 = Math.abs(((Number) next2).floatValue() - fN);
                        if (Float.compare(fAbs, fAbs2) > 0) {
                            next = next2;
                            fAbs = fAbs2;
                        }
                    } while (it2.hasNext());
                }
                obj = next;
            } else {
                obj = null;
            }
            Float f2 = (Float) obj;
            if (f2 != null) {
                fN = f2.floatValue();
            }
        }
        boolean z = false;
        if (!(fN == this.z)) {
            this.A.invoke(Float.valueOf(fN));
            z = true;
        }
        return Boolean.valueOf(z);
    }
}
