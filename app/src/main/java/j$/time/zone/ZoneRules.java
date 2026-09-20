package j$.time.zone;

import com.facebook.ads.AdError;
import j$.time.Clock;
import j$.time.Instant;
import j$.time.LocalDateTime;
import j$.time.ZoneOffset;
import j$.time.chrono.AbstractC1450e;
import j$.util.AbstractC1514m;
import j$.util.concurrent.ConcurrentHashMap;
import java.io.DataInput;
import java.io.DataOutput;
import java.io.IOException;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.TimeZone;

/* JADX INFO: loaded from: classes2.dex */
public final class ZoneRules implements Serializable {
    private static final long[] i = new long[0];
    private static final e[] j = new e[0];
    private static final LocalDateTime[] k = new LocalDateTime[0];
    private static final b[] l = new b[0];
    private static final long serialVersionUID = 3044319355680032515L;
    private final long[] a;
    private final ZoneOffset[] b;
    private final long[] c;
    private final LocalDateTime[] d;
    private final ZoneOffset[] e;
    private final e[] f;
    private final TimeZone g;
    private final transient ConcurrentHashMap h = new ConcurrentHashMap();

    private ZoneRules(ZoneOffset zoneOffset) {
        ZoneOffset[] zoneOffsetArr = {zoneOffset};
        this.b = zoneOffsetArr;
        long[] jArr = i;
        this.a = jArr;
        this.c = jArr;
        this.d = k;
        this.e = zoneOffsetArr;
        this.f = j;
        this.g = null;
    }

    ZoneRules(TimeZone timeZone) {
        ZoneOffset[] zoneOffsetArr = {i(timeZone.getRawOffset())};
        this.b = zoneOffsetArr;
        long[] jArr = i;
        this.a = jArr;
        this.c = jArr;
        this.d = k;
        this.e = zoneOffsetArr;
        this.f = j;
        this.g = timeZone;
    }

    private ZoneRules(long[] jArr, ZoneOffset[] zoneOffsetArr, long[] jArr2, ZoneOffset[] zoneOffsetArr2, e[] eVarArr) {
        LocalDateTime localDateTimeK;
        this.a = jArr;
        this.b = zoneOffsetArr;
        this.c = jArr2;
        this.e = zoneOffsetArr2;
        this.f = eVarArr;
        if (jArr2.length == 0) {
            this.d = k;
        } else {
            ArrayList arrayList = new ArrayList();
            int i2 = 0;
            while (i2 < jArr2.length) {
                int i3 = i2 + 1;
                b bVar = new b(jArr2[i2], zoneOffsetArr2[i2], zoneOffsetArr2[i3]);
                if (bVar.M()) {
                    arrayList.add(bVar.k());
                    localDateTimeK = bVar.j();
                } else {
                    arrayList.add(bVar.j());
                    localDateTimeK = bVar.k();
                }
                arrayList.add(localDateTimeK);
                i2 = i3;
            }
            this.d = (LocalDateTime[]) arrayList.toArray(new LocalDateTime[arrayList.size()]);
        }
        this.g = null;
    }

    private static Object a(LocalDateTime localDateTime, b bVar) {
        LocalDateTime localDateTimeK = bVar.k();
        boolean zM = bVar.M();
        boolean zS = localDateTime.S(localDateTimeK);
        if (zM) {
            if (zS) {
                return bVar.z();
            }
            return localDateTime.S(bVar.j()) ? bVar : bVar.p();
        }
        if (zS) {
            return localDateTime.S(bVar.j()) ? bVar.z() : bVar;
        }
        return bVar.p();
    }

    private b[] b(int i2) {
        long j2;
        Integer numValueOf = Integer.valueOf(i2);
        ConcurrentHashMap concurrentHashMap = this.h;
        b[] bVarArr = (b[]) concurrentHashMap.get(numValueOf);
        if (bVarArr != null) {
            return bVarArr;
        }
        TimeZone timeZone = this.g;
        if (timeZone == null) {
            e[] eVarArr = this.f;
            b[] bVarArr2 = new b[eVarArr.length];
            for (int i3 = 0; i3 < eVarArr.length; i3++) {
                bVarArr2[i3] = eVarArr[i3].a(i2);
            }
            if (i2 < 2100) {
                concurrentHashMap.putIfAbsent(numValueOf, bVarArr2);
            }
            return bVarArr2;
        }
        b[] bVarArr3 = l;
        if (i2 < 1800) {
            return bVarArr3;
        }
        long jP = AbstractC1450e.p(LocalDateTime.T(i2 - 1), this.b[0]);
        int offset = timeZone.getOffset(jP * 1000);
        long j3 = 31968000 + jP;
        while (jP < j3) {
            long j4 = 7776000 + jP;
            long j5 = jP;
            if (offset != timeZone.getOffset(j4 * 1000)) {
                jP = j5;
                while (j4 - jP > 1) {
                    int i4 = offset;
                    long j6 = j3;
                    long jG = j$.time.a.g(j4 + jP, 2L);
                    if (timeZone.getOffset(jG * 1000) == i4) {
                        jP = jG;
                    } else {
                        j4 = jG;
                    }
                    offset = i4;
                    j3 = j6;
                }
                j2 = j3;
                int i5 = offset;
                if (timeZone.getOffset(jP * 1000) == i5) {
                    jP = j4;
                }
                ZoneOffset zoneOffsetI = i(i5);
                offset = timeZone.getOffset(jP * 1000);
                ZoneOffset zoneOffsetI2 = i(offset);
                if (c(jP, zoneOffsetI2) == i2) {
                    bVarArr3 = (b[]) Arrays.copyOf(bVarArr3, bVarArr3.length + 1);
                    bVarArr3[bVarArr3.length - 1] = new b(jP, zoneOffsetI, zoneOffsetI2);
                }
            } else {
                j2 = j3;
                jP = j4;
            }
            j3 = j2;
        }
        if (1916 <= i2 && i2 < 2100) {
            concurrentHashMap.putIfAbsent(numValueOf, bVarArr3);
        }
        return bVarArr3;
    }

    private static int c(long j2, ZoneOffset zoneOffset) {
        return j$.time.h.a0(j$.time.a.g(j2 + ((long) zoneOffset.S()), 86400)).T();
    }

    private Object e(LocalDateTime localDateTime) {
        Object obj = null;
        ZoneOffset[] zoneOffsetArr = this.b;
        int i2 = 0;
        TimeZone timeZone = this.g;
        if (timeZone != null) {
            b[] bVarArrB = b(localDateTime.Q());
            if (bVarArrB.length == 0) {
                return i(timeZone.getOffset(AbstractC1450e.p(localDateTime, zoneOffsetArr[0]) * 1000));
            }
            int length = bVarArrB.length;
            while (i2 < length) {
                b bVar = bVarArrB[i2];
                Object objA = a(localDateTime, bVar);
                if ((objA instanceof b) || objA.equals(bVar.z())) {
                    return objA;
                }
                i2++;
                obj = objA;
            }
            return obj;
        }
        if (this.c.length == 0) {
            return zoneOffsetArr[0];
        }
        int length2 = this.f.length;
        LocalDateTime[] localDateTimeArr = this.d;
        if (length2 > 0 && localDateTime.R(localDateTimeArr[localDateTimeArr.length - 1])) {
            b[] bVarArrB2 = b(localDateTime.Q());
            int length3 = bVarArrB2.length;
            while (i2 < length3) {
                b bVar2 = bVarArrB2[i2];
                Object objA2 = a(localDateTime, bVar2);
                if ((objA2 instanceof b) || objA2.equals(bVar2.z())) {
                    return objA2;
                }
                i2++;
                obj = objA2;
            }
            return obj;
        }
        int iBinarySearch = Arrays.binarySearch(localDateTimeArr, localDateTime);
        ZoneOffset[] zoneOffsetArr2 = this.e;
        if (iBinarySearch == -1) {
            return zoneOffsetArr2[0];
        }
        if (iBinarySearch < 0) {
            iBinarySearch = (-iBinarySearch) - 2;
        } else if (iBinarySearch < localDateTimeArr.length - 1) {
            int i3 = iBinarySearch + 1;
            if (localDateTimeArr[iBinarySearch].equals(localDateTimeArr[i3])) {
                iBinarySearch = i3;
            }
        }
        if ((iBinarySearch & 1) != 0) {
            return zoneOffsetArr2[(iBinarySearch / 2) + 1];
        }
        LocalDateTime localDateTime2 = localDateTimeArr[iBinarySearch];
        LocalDateTime localDateTime3 = localDateTimeArr[iBinarySearch + 1];
        int i4 = iBinarySearch / 2;
        ZoneOffset zoneOffset = zoneOffsetArr2[i4];
        ZoneOffset zoneOffset2 = zoneOffsetArr2[i4 + 1];
        return zoneOffset2.S() > zoneOffset.S() ? new b(localDateTime2, zoneOffset, zoneOffset2) : new b(localDateTime3, zoneOffset, zoneOffset2);
    }

    public static ZoneRules h(ZoneOffset zoneOffset) {
        if (zoneOffset != null) {
            return new ZoneRules(zoneOffset);
        }
        throw new NullPointerException("offset");
    }

    private static ZoneOffset i(int i2) {
        return ZoneOffset.U(i2 / AdError.NETWORK_ERROR_CODE);
    }

    static ZoneRules j(DataInput dataInput) throws IOException {
        int i2 = dataInput.readInt();
        long[] jArr = i;
        long[] jArr2 = i2 == 0 ? jArr : new long[i2];
        for (int i3 = 0; i3 < i2; i3++) {
            jArr2[i3] = a.a(dataInput);
        }
        int i4 = i2 + 1;
        ZoneOffset[] zoneOffsetArr = new ZoneOffset[i4];
        for (int i5 = 0; i5 < i4; i5++) {
            zoneOffsetArr[i5] = a.b(dataInput);
        }
        int i6 = dataInput.readInt();
        if (i6 != 0) {
            jArr = new long[i6];
        }
        long[] jArr3 = jArr;
        for (int i7 = 0; i7 < i6; i7++) {
            jArr3[i7] = a.a(dataInput);
        }
        int i8 = i6 + 1;
        ZoneOffset[] zoneOffsetArr2 = new ZoneOffset[i8];
        for (int i9 = 0; i9 < i8; i9++) {
            zoneOffsetArr2[i9] = a.b(dataInput);
        }
        int i10 = dataInput.readByte();
        e[] eVarArr = i10 == 0 ? j : new e[i10];
        for (int i11 = 0; i11 < i10; i11++) {
            eVarArr[i11] = e.b(dataInput);
        }
        return new ZoneRules(jArr2, zoneOffsetArr, jArr3, zoneOffsetArr2, eVarArr);
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    private Object writeReplace() {
        return new a(this.g != null ? (byte) 100 : (byte) 1, this);
    }

    public final ZoneOffset d(Instant instant) {
        TimeZone timeZone = this.g;
        if (timeZone != null) {
            return i(timeZone.getOffset(instant.S()));
        }
        long[] jArr = this.c;
        if (jArr.length == 0) {
            return this.b[0];
        }
        long epochSecond = instant.getEpochSecond();
        int length = this.f.length;
        ZoneOffset[] zoneOffsetArr = this.e;
        if (length <= 0 || epochSecond <= jArr[jArr.length - 1]) {
            int iBinarySearch = Arrays.binarySearch(jArr, epochSecond);
            if (iBinarySearch < 0) {
                iBinarySearch = (-iBinarySearch) - 2;
            }
            return zoneOffsetArr[iBinarySearch + 1];
        }
        b[] bVarArrB = b(c(epochSecond, zoneOffsetArr[zoneOffsetArr.length - 1]));
        b bVar = null;
        for (int i2 = 0; i2 < bVarArrB.length; i2++) {
            bVar = bVarArrB[i2];
            if (epochSecond < bVar.L()) {
                return bVar.z();
            }
        }
        return bVar.p();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ZoneRules)) {
            return false;
        }
        ZoneRules zoneRules = (ZoneRules) obj;
        return AbstractC1514m.p(this.g, zoneRules.g) && Arrays.equals(this.a, zoneRules.a) && Arrays.equals(this.b, zoneRules.b) && Arrays.equals(this.c, zoneRules.c) && Arrays.equals(this.e, zoneRules.e) && Arrays.equals(this.f, zoneRules.f);
    }

    public final b f(LocalDateTime localDateTime) {
        Object objE = e(localDateTime);
        if (objE instanceof b) {
            return (b) objE;
        }
        return null;
    }

    public final List g(LocalDateTime localDateTime) {
        Object objE = e(localDateTime);
        return objE instanceof b ? ((b) objE).G() : Collections.singletonList((ZoneOffset) objE);
    }

    public final int hashCode() {
        TimeZone timeZone = this.g;
        return (((((timeZone != null ? timeZone.hashCode() : 0) ^ Arrays.hashCode(this.a)) ^ Arrays.hashCode(this.b)) ^ Arrays.hashCode(this.c)) ^ Arrays.hashCode(this.e)) ^ Arrays.hashCode(this.f);
    }

    /* JADX WARN: Code duplicated, block: B:43:0x00e1 A[ORIG_RETURN, RETURN] */
    /* JADX WARN: Code duplicated, block: B:58:? A[RETURN, SYNTHETIC] */
    public boolean isFixedOffset() {
        b bVar;
        TimeZone timeZone = this.g;
        if (timeZone == null) {
            return this.c.length == 0;
        }
        if (timeZone.useDaylightTime() || timeZone.getDSTSavings() != 0) {
            return false;
        }
        Instant instant = Instant.c;
        Instant instant2 = Clock.systemUTC().instant();
        long epochSecond = instant2.getEpochSecond();
        if (instant2.getNano() > 0 && epochSecond < Long.MAX_VALUE) {
            epochSecond++;
        }
        int iC = c(epochSecond, d(instant2));
        b[] bVarArrB = b(iC);
        for (int length = bVarArrB.length - 1; length >= 0; length--) {
            if (epochSecond > bVarArrB[length].L()) {
                bVar = bVarArrB[length];
                if (bVar == null) {
                    return true;
                }
                return false;
            }
        }
        if (iC > 1800) {
            b[] bVarArrB2 = b(iC - 1);
            for (int length2 = bVarArrB2.length - 1; length2 >= 0; length2--) {
                if (epochSecond > bVarArrB2[length2].L()) {
                    bVar = bVarArrB2[length2];
                }
            }
            int offset = timeZone.getOffset((epochSecond - 1) * 1000);
            long jE = j$.time.h.Y(1800, 1, 1).E() * 86400;
            for (long jMin = Math.min(epochSecond - 31104000, (Clock.systemUTC().b() / 1000) + 31968000); jE <= jMin; jMin -= 7776000) {
                int offset2 = timeZone.getOffset(jMin * 1000);
                if (offset != offset2) {
                    int iC2 = c(jMin, i(offset2));
                    b[] bVarArrB3 = b(iC2 + 1);
                    for (int length3 = bVarArrB3.length - 1; length3 >= 0; length3--) {
                        if (epochSecond > bVarArrB3[length3].L()) {
                            bVar = bVarArrB3[length3];
                        }
                    }
                    b[] bVarArrB4 = b(iC2);
                    bVar = bVarArrB4[bVarArrB4.length - 1];
                }
            }
            bVar = null;
        } else {
            bVar = null;
        }
        if (bVar == null) {
            return true;
        }
        return false;
    }

    final void k(DataOutput dataOutput) throws IOException {
        long[] jArr = this.a;
        dataOutput.writeInt(jArr.length);
        for (long j2 : jArr) {
            a.c(j2, dataOutput);
        }
        for (ZoneOffset zoneOffset : this.b) {
            a.d(zoneOffset, dataOutput);
        }
        long[] jArr2 = this.c;
        dataOutput.writeInt(jArr2.length);
        for (long j3 : jArr2) {
            a.c(j3, dataOutput);
        }
        for (ZoneOffset zoneOffset2 : this.e) {
            a.d(zoneOffset2, dataOutput);
        }
        e[] eVarArr = this.f;
        dataOutput.writeByte(eVarArr.length);
        for (e eVar : eVarArr) {
            eVar.c(dataOutput);
        }
    }

    final void l(DataOutput dataOutput) throws IOException {
        dataOutput.writeUTF(this.g.getID());
    }

    public final String toString() {
        TimeZone timeZone = this.g;
        if (timeZone != null) {
            return "ZoneRules[timeZone=" + timeZone.getID() + "]";
        }
        StringBuilder sb = new StringBuilder("ZoneRules[currentStandardOffset=");
        ZoneOffset[] zoneOffsetArr = this.b;
        sb.append(zoneOffsetArr[zoneOffsetArr.length - 1]);
        sb.append("]");
        return sb.toString();
    }
}
