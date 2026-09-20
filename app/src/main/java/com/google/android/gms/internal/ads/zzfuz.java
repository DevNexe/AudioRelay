package com.google.android.gms.internal.ads;

import defpackage.ko6;
import java.util.Arrays;
import java.util.Iterator;
import javax.annotation.CheckForNull;

/* JADX INFO: loaded from: classes3.dex */
public final class zzfuz extends NUlFixed {

    @CheckForNull
    public Object[] d;
    public int e;

    public zzfuz() {
        super(4);
    }

    @Override // com.google.android.gms.internal.ads.NUlFixed, com.google.android.gms.internal.ads.zzfup
    public final /* bridge */ /* synthetic */ zzfup zzb(Object obj) {
        zze(obj);
        return this;
    }

    public final zzfuz zze(Object obj) {
        obj.getClass();
        if (this.d != null) {
            int iF = zzfva.f(this.b);
            int length = this.d.length;
            if (iF <= length) {
                int i = length - 1;
                int iHashCode = obj.hashCode();
                int iG = ko6.g(iHashCode);
                while (true) {
                    int i2 = iG & i;
                    Object[] objArr = this.d;
                    Object obj2 = objArr[i2];
                    if (obj2 != null) {
                        if (obj2.equals(obj)) {
                            break;
                        }
                        iG = i2 + 1;
                    } else {
                        objArr[i2] = obj;
                        this.e += iHashCode;
                        super.zza(obj);
                        break;
                    }
                }
                return this;
            }
        }
        this.d = null;
        super.zza(obj);
        return this;
    }

    public final zzfuz zzf(Iterable iterable) {
        if (this.d != null) {
            Iterator it = iterable.iterator();
            while (it.hasNext()) {
                zze(it.next());
            }
        } else {
            super.zzc(iterable);
        }
        return this;
    }

    public final zzfva zzg() {
        zzfva zzfvaVarH;
        int i = this.b;
        if (i == 0) {
            return PRnFixed.E;
        }
        if (i == 1) {
            Object obj = this.a[0];
            obj.getClass();
            return new y(obj);
        }
        if (this.d == null || zzfva.f(i) != this.d.length) {
            zzfvaVarH = zzfva.h(this.b, this.a);
            this.b = zzfvaVarH.size();
        } else {
            int i2 = this.b;
            Object[] objArrCopyOf = this.a;
            int length = objArrCopyOf.length;
            if (i2 < (length >> 1) + (length >> 2)) {
                objArrCopyOf = Arrays.copyOf(objArrCopyOf, i2);
            }
            int i3 = this.e;
            Object[] objArr = this.d;
            zzfvaVarH = new PRnFixed(i3, objArr.length - 1, this.b, objArrCopyOf, objArr);
        }
        this.c = true;
        this.d = null;
        return zzfvaVarH;
    }

    public zzfuz(int i) {
        super(i);
        this.d = new Object[zzfva.f(i)];
    }
}
