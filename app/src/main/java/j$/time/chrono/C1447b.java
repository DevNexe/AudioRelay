package j$.time.chrono;

import java.io.Serializable;
import java.util.Comparator;

/* JADX INFO: renamed from: j$.time.chrono.b, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class C1447b implements Comparator, Serializable {
    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        ChronoLocalDateTime chronoLocalDateTime = (ChronoLocalDateTime) obj;
        ChronoLocalDateTime chronoLocalDateTime2 = (ChronoLocalDateTime) obj2;
        int i = AbstractC1449d.c;
        int iCompare = Long.compare(chronoLocalDateTime.f().E(), chronoLocalDateTime2.f().E());
        return iCompare == 0 ? Long.compare(chronoLocalDateTime.b().d0(), chronoLocalDateTime2.b().d0()) : iCompare;
    }
}
