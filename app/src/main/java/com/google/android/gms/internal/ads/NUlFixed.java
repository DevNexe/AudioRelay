package com.google.android.gms.internal.ads;

import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;

/* JADX INFO: loaded from: classes3.dex */
public class NUlFixed extends zzfup {
    public Object[] a;
    public int b = 0;
    public boolean c;

    public NUlFixed(int i) {
        this.a = new Object[i];
    }

    public final void a(int i) {
        Object[] objArr = this.a;
        int length = objArr.length;
        if (length >= i) {
            if (this.c) {
                this.a = (Object[]) objArr.clone();
                this.c = false;
                return;
            }
            return;
        }
        int i2 = length + (length >> 1) + 1;
        if (i2 < i) {
            int iHighestOneBit = Integer.highestOneBit(i - 1);
            i2 = iHighestOneBit + iHighestOneBit;
        }
        if (i2 < 0) {
            i2 = Integer.MAX_VALUE;
        }
        this.a = Arrays.copyOf(objArr, i2);
        this.c = false;
    }

    public final NUlFixed zza(Object obj) {
        obj.getClass();
        a(this.b + 1);
        Object[] objArr = this.a;
        int i = this.b;
        this.b = i + 1;
        objArr[i] = obj;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzfup
    public /* bridge */ /* synthetic */ zzfup zzb(Object obj) {
        throw null;
    }

    public final zzfup zzc(Iterable iterable) {
        if (iterable instanceof Collection) {
            Collection collection = (Collection) iterable;
            a(collection.size() + this.b);
            if (collection instanceof zzfuq) {
                this.b = ((zzfuq) collection).a(this.b, this.a);
                return this;
            }
        }
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            zzb(it.next());
        }
        return this;
    }
}
