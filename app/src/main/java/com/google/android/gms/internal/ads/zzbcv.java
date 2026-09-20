package com.google.android.gms.internal.ads;

import java.util.PriorityQueue;
import javax.annotation.ParametersAreNonnullByDefault;

/* JADX INFO: loaded from: classes3.dex */
@ParametersAreNonnullByDefault
public final class zzbcv {
    public static long a(int i, long j) {
        if (i == 1) {
            return j;
        }
        if ((i & 1) == 0) {
            return a(i >> 1, (j * j) % 1073807359) % 1073807359;
        }
        return ((a(i >> 1, (j * j) % 1073807359) % 1073807359) * j) % 1073807359;
    }

    public static String b(String[] strArr, int i, int i2) {
        int i3 = i2 + i;
        if (strArr.length < i3) {
            zzcgn.zzg("Unable to construct shingle");
            return "";
        }
        StringBuilder sb = new StringBuilder();
        while (true) {
            int i4 = i3 - 1;
            if (i >= i4) {
                sb.append(strArr[i4]);
                return sb.toString();
            }
            sb.append(strArr[i]);
            sb.append(' ');
            i++;
        }
    }

    public static void c(int i, long j, String str, int i2, PriorityQueue priorityQueue) {
        zzbcu zzbcuVar = new zzbcu(i2, j, str);
        if ((priorityQueue.size() != i || (((zzbcu) priorityQueue.peek()).c <= i2 && ((zzbcu) priorityQueue.peek()).a <= j)) && !priorityQueue.contains(zzbcuVar)) {
            priorityQueue.add(zzbcuVar);
            if (priorityQueue.size() > i) {
                priorityQueue.poll();
            }
        }
    }

    public static long d(String[] strArr, int i) {
        long jZza = (((long) zzbcr.zza(strArr[0])) + 2147483647L) % 1073807359;
        for (int i2 = 1; i2 < i; i2++) {
            jZza = (((((long) zzbcr.zza(strArr[i2])) + 2147483647L) % 1073807359) + ((jZza * 16785407) % 1073807359)) % 1073807359;
        }
        return jZza;
    }

    public static void zzc(String[] strArr, int i, int i2, PriorityQueue priorityQueue) {
        int length = strArr.length;
        if (length < 6) {
            c(i, d(strArr, length), b(strArr, 0, length), length, priorityQueue);
            return;
        }
        long jD = d(strArr, 6);
        c(i, jD, b(strArr, 0, 6), 6, priorityQueue);
        long jA = a(5, 16785407L);
        int i3 = 1;
        while (true) {
            int length2 = strArr.length;
            if (i3 >= length2 - 5) {
                return;
            }
            jD = (((((long) zzbcr.zza(strArr[i3 + 5])) + 2147483647L) % 1073807359) + (((((jD + 1073807359) - ((((((long) zzbcr.zza(strArr[i3 - 1])) + 2147483647L) % 1073807359) * jA) % 1073807359)) % 1073807359) * 16785407) % 1073807359)) % 1073807359;
            c(i, jD, b(strArr, i3, 6), length2, priorityQueue);
            i3++;
        }
    }
}
