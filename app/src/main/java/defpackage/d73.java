package defpackage;

import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public abstract class d73 {

    public static final class CQf extends d73 {
        public final int a;
        public final List<Long> b;
        public final long c;
        public final long d;
        public final boolean e;

        public CQf(int i, List<Long> list, long j, long j2, boolean z) {
            this.a = i;
            this.b = list;
            this.c = j;
            this.d = j2;
            this.e = z;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof CQf)) {
                return false;
            }
            CQf cQf = (CQf) obj;
            return this.a == cQf.a && ur1.a(this.b, cQf.b) && this.c == cQf.c && this.d == cQf.d && this.e == cQf.e;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r0v7, types: [int] */
        /* JADX WARN: Type inference failed for: r1v6, types: [int] */
        /* JADX WARN: Type inference failed for: r1v7 */
        /* JADX WARN: Type inference failed for: r1v8 */
        public final int hashCode() {
            int iA = qg5.a(this.b, this.a * 31, 31);
            long j = this.c;
            int i = (iA + ((int) (j ^ (j >>> 32)))) * 31;
            long j2 = this.d;
            int i2 = (i + ((int) (j2 ^ (j2 >>> 32)))) * 31;
            boolean z = this.e;
            ?? r1 = z;
            if (z) {
                r1 = 1;
            }
            return i2 + r1;
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("NetworkMeasurements(bytesReceived=");
            sb.append(this.a);
            sb.append(", latencies=");
            sb.append(this.b);
            sb.append(", expectedPacketCount=");
            sb.append(this.c);
            sb.append(", packetLossCount=");
            sb.append(this.d);
            sb.append(", hasOutOfOrderPackets=");
            return Md5A.f(sb, this.e, ")");
        }
    }

    public static final class QnHx extends d73 {
        public static final QnHx h = new QnHx(0, 0, 0, 0, 0, 0, 0);
        public final long a;
        public final long b;
        public final long c;
        public final long d;
        public final long e;
        public final long f;
        public final long g;

        public QnHx(long j, long j2, long j3, long j4, long j5, long j6, long j7) {
            this.a = j;
            this.b = j2;
            this.c = j3;
            this.d = j4;
            this.e = j5;
            this.f = j6;
            this.g = j7;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof QnHx)) {
                return false;
            }
            QnHx qnHx = (QnHx) obj;
            return this.a == qnHx.a && this.b == qnHx.b && this.c == qnHx.c && this.d == qnHx.d && this.e == qnHx.e && this.f == qnHx.f && this.g == qnHx.g;
        }

        public final int hashCode() {
            long j = this.a;
            long j2 = this.b;
            int i = ((((int) (j ^ (j >>> 32))) * 31) + ((int) (j2 ^ (j2 >>> 32)))) * 31;
            long j3 = this.c;
            int i2 = (i + ((int) (j3 ^ (j3 >>> 32)))) * 31;
            long j4 = this.d;
            int i3 = (i2 + ((int) (j4 ^ (j4 >>> 32)))) * 31;
            long j5 = this.e;
            int i4 = (i3 + ((int) (j5 ^ (j5 >>> 32)))) * 31;
            long j6 = this.f;
            int i5 = (i4 + ((int) (j6 ^ (j6 >>> 32)))) * 31;
            long j7 = this.g;
            return i5 + ((int) (j7 ^ (j7 >>> 32)));
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("AudioMeasurements(bufferedAmountInMs=");
            sb.append(this.a);
            sb.append(", bufferedAmountInBytes=");
            sb.append(this.b);
            sb.append(", maxBufferedAmountInMs=");
            sb.append(this.c);
            sb.append(", maxBufferedAmountInBytes=");
            sb.append(this.d);
            sb.append(", discardedAmountInBytes=");
            sb.append(this.e);
            sb.append(", discardedAmountInMs=");
            sb.append(this.f);
            sb.append(", underflowCount=");
            return hc2.a(sb, this.g, ")");
        }
    }
}
