package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzgmn;
import com.google.android.gms.internal.ads.zzgmo;
import defpackage.fc2;
import defpackage.ht6;
import java.io.IOException;
import java.io.OutputStream;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.logging.Logger;

/* JADX INFO: loaded from: classes3.dex */
public abstract class zzgmo<MessageType extends zzgmo<MessageType, BuilderType>, BuilderType extends zzgmn<MessageType, BuilderType>> implements zzgpx {
    protected int zza = 0;

    /* JADX WARN: Multi-variable type inference failed */
    public static void b(Iterable iterable, zzgow zzgowVar) {
        Charset charset = zzgox.a;
        iterable.getClass();
        if (zzgowVar instanceof ArrayList) {
            ((ArrayList) zzgowVar).ensureCapacity(iterable.size() + zzgowVar.size());
        }
        int size = zzgowVar.size();
        for (Object obj : iterable) {
            if (obj == null) {
                String str = "Element at index " + (zzgowVar.size() - size) + " is null.";
                int size2 = zzgowVar.size();
                while (true) {
                    size2--;
                    if (size2 < size) {
                        throw new NullPointerException(str);
                    }
                    zzgowVar.remove(size2);
                }
            } else {
                zzgowVar.add(obj);
            }
        }
    }

    public int a() {
        throw null;
    }

    public void c(int i) {
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.zzgpx
    public final zzgnf zzas() {
        try {
            int iZzax = zzax();
            zzgnf zzgnfVar = zzgnf.zzb;
            byte[] bArr = new byte[iZzax];
            zzgnu zzgnuVarZzG = zzgnu.zzG(bArr);
            zzaQ(zzgnuVarZzG);
            zzgnuVarZzG.zzI();
            return new ht6(bArr);
        } catch (IOException e) {
            throw new RuntimeException(fc2.a("Serializing ", getClass().getName(), " to a ByteString threw an IOException (should never happen)."), e);
        }
    }

    public final void zzav(OutputStream outputStream) {
        int iZzax = zzax();
        Logger logger = zzgnu.b;
        if (iZzax > 4096) {
            iZzax = 4096;
        }
        zzgnu zzgnuVarZzH = zzgnu.zzH(outputStream, iZzax);
        zzaQ(zzgnuVarZzH);
        zzgnuVarZzH.zzN();
    }

    @Override // com.google.android.gms.internal.ads.zzgpx
    public final byte[] zzaw() {
        try {
            byte[] bArr = new byte[zzax()];
            zzgnu zzgnuVarZzG = zzgnu.zzG(bArr);
            zzaQ(zzgnuVarZzG);
            zzgnuVarZzG.zzI();
            return bArr;
        } catch (IOException e) {
            throw new RuntimeException(fc2.a("Serializing ", getClass().getName(), " to a byte array threw an IOException (should never happen)."), e);
        }
    }
}
