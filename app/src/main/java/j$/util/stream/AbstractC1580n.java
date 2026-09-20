package j$.util.stream;

import java.util.Collections;
import java.util.EnumSet;

/* JADX INFO: renamed from: j$.util.stream.n, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC1580n {
    public static final /* synthetic */ int a = 0;

    static {
        EnumC1564j enumC1564j = EnumC1564j.CONCURRENT;
        EnumC1564j enumC1564j2 = EnumC1564j.UNORDERED;
        EnumC1564j enumC1564j3 = EnumC1564j.IDENTITY_FINISH;
        Collections.unmodifiableSet(EnumSet.of(enumC1564j, enumC1564j2, enumC1564j3));
        Collections.unmodifiableSet(EnumSet.of(enumC1564j, enumC1564j2));
        Collections.unmodifiableSet(EnumSet.of(enumC1564j3));
        Collections.unmodifiableSet(EnumSet.of(enumC1564j2, enumC1564j3));
        Collections.emptySet();
    }

    static void a(double[] dArr, double d) {
        double d2 = d - dArr[1];
        double d3 = dArr[0];
        double d4 = d3 + d2;
        dArr[1] = (d4 - d3) - d2;
        dArr[0] = d4;
    }
}
