package j$.time.chrono;

import java.io.Serializable;
import java.util.Comparator;

/* JADX INFO: renamed from: j$.time.chrono.c, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class C1448c implements Comparator, Serializable {
    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        ChronoZonedDateTime chronoZonedDateTime = (ChronoZonedDateTime) obj;
        ChronoZonedDateTime chronoZonedDateTime2 = (ChronoZonedDateTime) obj2;
        int i = AbstractC1449d.c;
        int iCompare = Long.compare(chronoZonedDateTime.L(), chronoZonedDateTime2.L());
        return iCompare == 0 ? Long.compare(chronoZonedDateTime.b().R(), chronoZonedDateTime2.b().R()) : iCompare;
    }
}
