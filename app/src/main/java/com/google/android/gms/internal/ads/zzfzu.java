package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.io.OutputStream;

/* JADX INFO: loaded from: classes3.dex */
public final class zzfzu {
    public final OutputStream a;

    public zzfzu(OutputStream outputStream) {
        this.a = outputStream;
    }

    public static zzfzu zzb(OutputStream outputStream) {
        return new zzfzu(outputStream);
    }

    public final void zza(zzgjt zzgjtVar) throws IOException {
        OutputStream outputStream = this.a;
        try {
            zzgjtVar.zzav(outputStream);
        } finally {
            outputStream.close();
        }
    }
}
