package com.google.android.gms.internal.ads;

import defpackage.dr6;
import defpackage.er6;
import j$.util.concurrent.ConcurrentHashMap;
import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class zzgat {
    public final Class a;
    public ConcurrentHashMap b = new ConcurrentHashMap();
    public zzgau c;

    public /* synthetic */ zzgat(Class cls) {
        this.a = cls;
        zzgfc zzgfcVar = zzgfc.zza;
    }

    public final void a(Object obj, zzgjs zzgjsVar, boolean z) throws GeneralSecurityException {
        byte[] bArrArray;
        if (this.b == null) {
            throw new IllegalStateException("addPrimitive cannot be called after build");
        }
        if (zzgjsVar.zzi() != 3) {
            throw new GeneralSecurityException("only ENABLED key is allowed");
        }
        new er6(zzgjsVar.zzc().zzf(), zzgjsVar.zzj());
        int iZzj = zzgjsVar.zzj() - 2;
        if (iZzj == 1) {
            bArrArray = ByteBuffer.allocate(5).put((byte) 1).putInt(zzgjsVar.zza()).array();
        } else if (iZzj == 2) {
            bArrArray = ByteBuffer.allocate(5).put((byte) 0).putInt(zzgjsVar.zza()).array();
        } else if (iZzj != 3) {
            if (iZzj != 4) {
                throw new GeneralSecurityException("unknown output prefix type");
            }
            bArrArray = ByteBuffer.allocate(5).put((byte) 0).putInt(zzgjsVar.zza()).array();
        } else {
            bArrArray = zzfzx.zza;
        }
        zzgjsVar.zzi();
        int iZzj2 = zzgjsVar.zzj();
        zzgjsVar.zza();
        zzgau zzgauVar = new zzgau(obj, bArrArray, iZzj2);
        ArrayList arrayList = new ArrayList();
        arrayList.add(zzgauVar);
        dr6 dr6Var = new dr6(zzgauVar.zzb());
        List list = (List) this.b.put(dr6Var, Collections.unmodifiableList(arrayList));
        if (list != null) {
            ArrayList arrayList2 = new ArrayList();
            arrayList2.addAll(list);
            arrayList2.add(zzgauVar);
            this.b.put(dr6Var, Collections.unmodifiableList(arrayList2));
        }
        if (z) {
            if (this.c != null) {
                throw new IllegalStateException("you cannot set two primary primitives");
            }
            this.c = zzgauVar;
        }
    }

    public final zzgat zza(Object obj, zzgjs zzgjsVar) throws GeneralSecurityException {
        a(obj, zzgjsVar, true);
        return this;
    }

    public final zzgat zzb(Object obj, zzgjs zzgjsVar) throws GeneralSecurityException {
        a(obj, zzgjsVar, false);
        return this;
    }

    public final zzgba zzc() {
        ConcurrentHashMap concurrentHashMap = this.b;
        if (concurrentHashMap == null) {
            throw new IllegalStateException("build cannot be called twice");
        }
        zzgba zzgbaVar = new zzgba(concurrentHashMap, this.c, this.a);
        this.b = null;
        return zzgbaVar;
    }
}
