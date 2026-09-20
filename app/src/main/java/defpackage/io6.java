package defpackage;

import com.google.android.gms.internal.ads.zzfsa;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public final class io6 extends yn6 {
    public final Object w;
    public int x;
    public final /* synthetic */ jo6 y;

    public io6(jo6 jo6Var, int i) {
        this.y = jo6Var;
        Object[] objArr = jo6Var.y;
        objArr.getClass();
        this.w = objArr[i];
        this.x = i;
    }

    public final void a() {
        int i = this.x;
        Object obj = this.w;
        jo6 jo6Var = this.y;
        if (i != -1 && i < jo6Var.size()) {
            int i2 = this.x;
            Object[] objArr = jo6Var.y;
            objArr.getClass();
            if (zzfsa.zza(obj, objArr[i2])) {
                return;
            }
        }
        Object obj2 = jo6.F;
        this.x = jo6Var.e(obj);
    }

    @Override // defpackage.yn6, java.util.Map.Entry
    public final Object getKey() {
        return this.w;
    }

    @Override // defpackage.yn6, java.util.Map.Entry
    public final Object getValue() {
        jo6 jo6Var = this.y;
        Map mapA = jo6Var.a();
        if (mapA != null) {
            return mapA.get(this.w);
        }
        a();
        int i = this.x;
        if (i == -1) {
            return null;
        }
        Object[] objArr = jo6Var.z;
        objArr.getClass();
        return objArr[i];
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        jo6 jo6Var = this.y;
        Map mapA = jo6Var.a();
        Object obj2 = this.w;
        if (mapA != null) {
            return mapA.put(obj2, obj);
        }
        a();
        int i = this.x;
        if (i == -1) {
            jo6Var.put(obj2, obj);
            return null;
        }
        Object[] objArr = jo6Var.z;
        objArr.getClass();
        Object obj3 = objArr[i];
        int i2 = this.x;
        Object[] objArr2 = jo6Var.z;
        objArr2.getClass();
        objArr2[i2] = obj;
        return obj3;
    }
}
