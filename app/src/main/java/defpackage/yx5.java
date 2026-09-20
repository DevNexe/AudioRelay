package defpackage;

import com.google.android.gms.internal.ads.zzajj;
import com.google.android.gms.internal.ads.zzajs;
import com.google.android.gms.internal.ads.zzakw;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public final class yx5 {
    public long a;
    public final String b;
    public final String c;
    public final long d;
    public final long e;
    public final long f;
    public final long g;
    public final List h;

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r0v1, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r0v2 */
    /* JADX WARN: Type inference failed for: r11v1, types: [java.util.List] */
    public yx5(String str, zzajj zzajjVar) {
        String str2 = zzajjVar.zzb;
        long j = zzajjVar.zzc;
        long j2 = zzajjVar.zzd;
        long j3 = zzajjVar.zze;
        long j4 = zzajjVar.zzf;
        ?? arrayList = zzajjVar.zzh;
        if (arrayList == 0) {
            Map map = zzajjVar.zzg;
            arrayList = new ArrayList(map.size());
            for (Map.Entry entry : map.entrySet()) {
                arrayList.add(new zzajs((String) entry.getKey(), (String) entry.getValue()));
            }
        }
        this(str, str2, j, j2, j3, j4, arrayList);
    }

    public static yx5 a(zx5 zx5Var) throws IOException {
        if ((zzakw.g(zx5Var) | (zzakw.g(zx5Var) << 8) | (zzakw.g(zx5Var) << 16) | (zzakw.g(zx5Var) << 24)) != 538247942) {
            throw new IOException();
        }
        String strB = zzakw.b(zx5Var);
        String strB2 = zzakw.b(zx5Var);
        long jA = zzakw.a(zx5Var);
        long jA2 = zzakw.a(zx5Var);
        long jA3 = zzakw.a(zx5Var);
        long jA4 = zzakw.a(zx5Var);
        int iG = zzakw.g(zx5Var) | (zzakw.g(zx5Var) << 8) | (zzakw.g(zx5Var) << 16) | (zzakw.g(zx5Var) << 24);
        if (iG < 0) {
            throw new IOException(GM.a("readHeaderList size=", iG));
        }
        List listEmptyList = iG == 0 ? Collections.emptyList() : new ArrayList();
        for (int i = 0; i < iG; i++) {
            listEmptyList.add(new zzajs(zzakw.b(zx5Var).intern(), zzakw.b(zx5Var).intern()));
        }
        return new yx5(strB, strB2, jA, jA2, jA3, jA4, listEmptyList);
    }

    public yx5(String str, String str2, long j, long j2, long j3, long j4, List list) {
        this.b = str;
        this.c = true == "".equals(str2) ? null : str2;
        this.d = j;
        this.e = j2;
        this.f = j3;
        this.g = j4;
        this.h = list;
    }
}
