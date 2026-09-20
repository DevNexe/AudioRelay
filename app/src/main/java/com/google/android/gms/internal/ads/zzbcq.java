package com.google.android.gms.internal.ads;

import android.util.Base64OutputStream;
import defpackage.cq4;
import defpackage.o26;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Locale;
import java.util.PriorityQueue;

/* JADX INFO: loaded from: classes3.dex */
public final class zzbcq {
    public final int a;
    public final zzbcs b = new zzbcs();

    public zzbcq(int i) {
        this.a = i;
    }

    public final String zza(ArrayList arrayList) {
        StringBuilder sb = new StringBuilder();
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            sb.append(((String) arrayList.get(i)).toLowerCase(Locale.US));
            sb.append('\n');
        }
        String[] strArrSplit = sb.toString().split("\n");
        if (strArrSplit.length == 0) {
            return "";
        }
        cq4 cq4Var = new cq4(16);
        o26 o26Var = new o26(1);
        int i2 = this.a;
        PriorityQueue priorityQueue = new PriorityQueue(i2, o26Var);
        for (String str : strArrSplit) {
            String[] strArrZzb = zzbcr.zzb(str, false);
            if (strArrZzb.length != 0) {
                zzbcv.zzc(strArrZzb, i2, 6, priorityQueue);
            }
        }
        Iterator it = priorityQueue.iterator();
        while (it.hasNext()) {
            try {
                ((Base64OutputStream) cq4Var.y).write(this.b.zzb(((zzbcu) it.next()).b));
            } catch (IOException e) {
                zzcgn.zzh("Error while writing hash to byteStream", e);
            }
        }
        return cq4Var.toString();
    }
}
