package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes3.dex */
public final class zzaqn extends zzarm {
    public static final zzarn E = new zzarn();
    public final Context D;

    public zzaqn(zzaqb zzaqbVar, String str, String str2, zzamh zzamhVar, int i, int i2, Context context) {
        super(zzaqbVar, "F65Z/VGvH3HDSqbisIa05H0FMwZRHR3bv6841vtkw2aGLMzg81raAO8ZiFdKkdju", "44x6GMcLLfXIM1YaNbXK6PVfUUKLz6aX2MRhfiwtXAQ=", zzamhVar, i, 29);
        this.D = context;
    }

    @Override // com.google.android.gms.internal.ads.zzarm
    public final void a() {
        this.z.zzm("E");
        AtomicReference atomicReferenceZza = E.zza(this.D.getPackageName());
        if (atomicReferenceZza.get() == null) {
            synchronized (atomicReferenceZza) {
                if (atomicReferenceZza.get() == null) {
                    atomicReferenceZza.set((String) this.A.invoke(null, this.D));
                }
            }
        }
        String str = (String) atomicReferenceZza.get();
        synchronized (this.z) {
            this.z.zzm(zzanm.zza(str.getBytes(), true));
        }
    }
}
