package j$.time;

import java.io.Externalizable;
import java.io.IOException;
import java.io.InvalidClassException;
import java.io.ObjectInput;
import java.io.ObjectOutput;
import java.io.Serializable;
import java.io.StreamCorruptedException;

/* JADX INFO: loaded from: classes2.dex */
final class t implements Externalizable {
    private static final long serialVersionUID = -7683839454370182990L;
    private byte a;
    private Object b;

    public t() {
    }

    t(byte b, Object obj) {
        this.a = b;
        this.b = obj;
    }

    static Serializable a(ObjectInput objectInput) {
        return b(objectInput.readByte(), objectInput);
    }

    private static Serializable b(byte b, ObjectInput objectInput) throws StreamCorruptedException {
        switch (b) {
            case 1:
                e eVar = e.c;
                return e.z(objectInput.readLong(), objectInput.readInt());
            case 2:
                Instant instant = Instant.c;
                return Instant.ofEpochSecond(objectInput.readLong(), objectInput.readInt());
            case 3:
                h hVar = h.d;
                return h.Y(objectInput.readInt(), objectInput.readByte(), objectInput.readByte());
            case 4:
                return l.c0(objectInput);
            case 5:
                LocalDateTime localDateTime = LocalDateTime.MIN;
                h hVar2 = h.d;
                return LocalDateTime.V(h.Y(objectInput.readInt(), objectInput.readByte(), objectInput.readByte()), l.c0(objectInput));
            case 6:
                return ZonedDateTime.Q(objectInput);
            case 7:
                int i = y.d;
                return ZoneId.M(objectInput.readUTF(), false);
            case 8:
                return ZoneOffset.W(objectInput);
            case 9:
                return r.O(objectInput);
            case 10:
                return OffsetDateTime.Q(objectInput);
            case 11:
                int i2 = v.b;
                return v.M(objectInput.readInt());
            case 12:
                return x.P(objectInput);
            case 13:
                return p.M(objectInput);
            case 14:
                return s.d(objectInput);
            default:
                throw new StreamCorruptedException("Unknown serialized type");
        }
    }

    private Object readResolve() {
        return this.b;
    }

    @Override // java.io.Externalizable
    public final void readExternal(ObjectInput objectInput) throws IOException {
        byte b = objectInput.readByte();
        this.a = b;
        this.b = b(b, objectInput);
    }

    @Override // java.io.Externalizable
    public final void writeExternal(ObjectOutput objectOutput) throws IOException {
        byte b = this.a;
        Object obj = this.b;
        objectOutput.writeByte(b);
        switch (b) {
            case 1:
                ((e) obj).G(objectOutput);
                return;
            case 2:
                ((Instant) obj).T(objectOutput);
                return;
            case 3:
                ((h) obj).m0(objectOutput);
                return;
            case 4:
                ((l) obj).h0(objectOutput);
                return;
            case 5:
                ((LocalDateTime) obj).f0(objectOutput);
                return;
            case 6:
                ((ZonedDateTime) obj).U(objectOutput);
                return;
            case 7:
                ((y) obj).R(objectOutput);
                return;
            case 8:
                ((ZoneOffset) obj).X(objectOutput);
                return;
            case 9:
                ((r) obj).writeExternal(objectOutput);
                return;
            case 10:
                ((OffsetDateTime) obj).writeExternal(objectOutput);
                return;
            case 11:
                ((v) obj).Q(objectOutput);
                return;
            case 12:
                ((x) obj).S(objectOutput);
                return;
            case 13:
                ((p) obj).N(objectOutput);
                return;
            case 14:
                ((s) obj).f(objectOutput);
                return;
            default:
                throw new InvalidClassException("Unknown serialized type");
        }
    }
}
