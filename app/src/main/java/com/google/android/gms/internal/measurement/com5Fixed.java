package com.google.android.gms.internal.measurement;

import com.google.android.gms.internal.measurement.com5Fixed;
import defpackage.a07;
import defpackage.d27;
import defpackage.e07;
import defpackage.f27;
import defpackage.fc2;
import defpackage.j07;
import defpackage.l07;
import defpackage.m27;
import defpackage.q37;
import defpackage.sy6;
import defpackage.u37;
import defpackage.v37;
import defpackage.vz6;
import defpackage.y37;
import java.io.IOException;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.logging.Logger;

/* JADX INFO: loaded from: classes3.dex */
public abstract class com5Fixed<MessageType extends com5Fixed<MessageType, BuilderType>, BuilderType extends sy6<MessageType, BuilderType>> implements q37 {
    protected int zzb = 0;

    /* JADX WARN: Multi-variable type inference failed */
    public static void e(Iterable iterable, d27 d27Var) {
        Charset charset = f27.a;
        iterable.getClass();
        if (iterable instanceof m27) {
            List listZzh = ((m27) iterable).zzh();
            m27 m27Var = (m27) d27Var;
            int size = d27Var.size();
            for (Object obj : listZzh) {
                if (obj == null) {
                    String str = "Element at index " + (m27Var.size() - size) + " is null.";
                    int size2 = m27Var.size();
                    while (true) {
                        size2--;
                        if (size2 < size) {
                            throw new NullPointerException(str);
                        }
                        m27Var.remove(size2);
                    }
                } else if (obj instanceof a07) {
                    m27Var.q((a07) obj);
                } else {
                    m27Var.add((String) obj);
                }
            }
            return;
        }
        if (iterable instanceof u37) {
            d27Var.addAll((Collection) iterable);
            return;
        }
        if ((d27Var instanceof ArrayList) && (iterable instanceof Collection)) {
            ((ArrayList) d27Var).ensureCapacity(((Collection) iterable).size() + d27Var.size());
        }
        int size3 = d27Var.size();
        for (Object obj2 : iterable) {
            if (obj2 == null) {
                String str2 = "Element at index " + (d27Var.size() - size3) + " is null.";
                int size4 = d27Var.size();
                while (true) {
                    size4--;
                    if (size4 < size3) {
                        throw new NullPointerException(str2);
                    }
                    d27Var.remove(size4);
                }
            } else {
                d27Var.add(obj2);
            }
        }
    }

    @Override // defpackage.q37
    public final vz6 a() {
        try {
            vDR vdr = (vDR) this;
            int i = vdr.i();
            vz6 vz6Var = a07.x;
            byte[] bArr = new byte[i];
            Logger logger = j07.x;
            e07 e07Var = new e07(bArr, i);
            y37 y37VarA = v37.c.a(vdr.getClass());
            l07 l07Var = e07Var.w;
            if (l07Var == null) {
                l07Var = new l07(e07Var);
            }
            y37VarA.e(vdr, l07Var);
            if (i - e07Var.B == 0) {
                return new vz6(bArr);
            }
            throw new IllegalStateException("Did not write as much data as expected.");
        } catch (IOException e) {
            throw new RuntimeException(fc2.a("Serializing ", getClass().getName(), " to a ByteString threw an IOException (should never happen)."), e);
        }
    }

    public int b() {
        throw null;
    }

    public void f(int i) {
        throw null;
    }

    public final byte[] g() {
        try {
            vDR vdr = (vDR) this;
            int i = vdr.i();
            byte[] bArr = new byte[i];
            Logger logger = j07.x;
            e07 e07Var = new e07(bArr, i);
            y37 y37VarA = v37.c.a(vdr.getClass());
            l07 l07Var = e07Var.w;
            if (l07Var == null) {
                l07Var = new l07(e07Var);
            }
            y37VarA.e(vdr, l07Var);
            if (i - e07Var.B == 0) {
                return bArr;
            }
            throw new IllegalStateException("Did not write as much data as expected.");
        } catch (IOException e) {
            throw new RuntimeException(fc2.a("Serializing ", getClass().getName(), " to a byte array threw an IOException (should never happen)."), e);
        }
    }
}
