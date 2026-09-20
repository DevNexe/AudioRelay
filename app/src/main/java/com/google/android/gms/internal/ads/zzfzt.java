package com.google.android.gms.internal.ads;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: loaded from: classes3.dex */
public final class zzfzt {
    public final InputStream a;

    public zzfzt(ByteArrayInputStream byteArrayInputStream) {
        this.a = byteArrayInputStream;
    }

    public static zzfzt zzb(byte[] bArr) {
        return new zzfzt(new ByteArrayInputStream(bArr));
    }

    public final zzgjt zza() throws IOException {
        InputStream inputStream = this.a;
        try {
            return zzgjt.zzf(inputStream, zzgnz.zza());
        } finally {
            inputStream.close();
        }
    }
}
