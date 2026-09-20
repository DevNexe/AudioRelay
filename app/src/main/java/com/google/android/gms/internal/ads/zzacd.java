package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.AdRequest;
import java.io.ByteArrayOutputStream;
import java.io.DataOutputStream;
import java.io.IOException;

/* JADX INFO: loaded from: classes3.dex */
public final class zzacd {
    public final ByteArrayOutputStream a;
    public final DataOutputStream b;

    public zzacd() {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(AdRequest.MAX_CONTENT_URL_LENGTH);
        this.a = byteArrayOutputStream;
        this.b = new DataOutputStream(byteArrayOutputStream);
    }

    public final byte[] zza(zzacc zzaccVar) {
        ByteArrayOutputStream byteArrayOutputStream = this.a;
        byteArrayOutputStream.reset();
        DataOutputStream dataOutputStream = this.b;
        try {
            dataOutputStream.writeBytes(zzaccVar.zza);
            dataOutputStream.writeByte(0);
            String str = zzaccVar.zzb;
            if (str == null) {
                str = "";
            }
            dataOutputStream.writeBytes(str);
            dataOutputStream.writeByte(0);
            dataOutputStream.writeLong(zzaccVar.zzc);
            dataOutputStream.writeLong(zzaccVar.zzd);
            dataOutputStream.write(zzaccVar.zze);
            dataOutputStream.flush();
            return byteArrayOutputStream.toByteArray();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
