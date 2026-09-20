package j$.time.chrono;

import j$.time.ZoneId;
import j$.time.ZoneOffset;
import java.io.Externalizable;
import java.io.IOException;
import java.io.InvalidClassException;
import java.io.ObjectInput;
import java.io.ObjectOutput;
import java.io.StreamCorruptedException;

/* JADX INFO: loaded from: classes2.dex */
final class H implements Externalizable {
    private static final long serialVersionUID = -6103370247208168577L;
    private byte a;
    private Object b;

    public H() {
    }

    H(byte b, Object obj) {
        this.a = b;
        this.b = obj;
    }

    private Object readResolve() {
        return this.b;
    }

    @Override // java.io.Externalizable
    public final void readExternal(ObjectInput objectInput) throws IOException {
        Object objP;
        byte b = objectInput.readByte();
        this.a = b;
        switch (b) {
            case 1:
                int i = AbstractC1449d.c;
                objP = AbstractC1449d.p(objectInput.readUTF());
                break;
            case 2:
                objP = ((InterfaceC1451f) objectInput.readObject()).F((j$.time.l) objectInput.readObject());
                break;
            case 3:
                objP = ((ChronoLocalDateTime) objectInput.readObject()).A((ZoneOffset) objectInput.readObject()).x((ZoneId) objectInput.readObject());
                break;
            case 4:
                j$.time.h hVar = A.d;
                int i2 = objectInput.readInt();
                byte b2 = objectInput.readByte();
                byte b3 = objectInput.readByte();
                y.d.getClass();
                objP = new A(j$.time.h.Y(i2, b2, b3));
                break;
            case 5:
                B b4 = B.d;
                objP = B.s(objectInput.readByte());
                break;
            case 6:
                r rVar = (r) objectInput.readObject();
                int i3 = objectInput.readInt();
                byte b5 = objectInput.readByte();
                byte b6 = objectInput.readByte();
                rVar.getClass();
                objP = t.U(rVar, i3, b5, b6);
                break;
            case 7:
                int i4 = objectInput.readInt();
                byte b7 = objectInput.readByte();
                byte b8 = objectInput.readByte();
                D.d.getClass();
                objP = new F(j$.time.h.Y(i4 + 1911, b7, b8));
                break;
            case 8:
                int i5 = objectInput.readInt();
                byte b9 = objectInput.readByte();
                byte b10 = objectInput.readByte();
                J.d.getClass();
                objP = new L(j$.time.h.Y(i5 - 543, b9, b10));
                break;
            case 9:
                int i6 = C1456k.e;
                objP = new C1456k(AbstractC1449d.p(objectInput.readUTF()), objectInput.readInt(), objectInput.readInt(), objectInput.readInt());
                break;
            default:
                throw new StreamCorruptedException("Unknown serialized type");
        }
        this.b = objP;
    }

    @Override // java.io.Externalizable
    public final void writeExternal(ObjectOutput objectOutput) throws IOException {
        byte b = this.a;
        Object obj = this.b;
        objectOutput.writeByte(b);
        switch (b) {
            case 1:
                objectOutput.writeUTF(((AbstractC1449d) obj).getId());
                return;
            case 2:
                ((C1455j) obj).writeExternal(objectOutput);
                return;
            case 3:
                ((n) obj).writeExternal(objectOutput);
                return;
            case 4:
                A a = (A) obj;
                a.getClass();
                objectOutput.writeInt(j$.time.temporal.p.a(a, j$.time.temporal.a.YEAR));
                objectOutput.writeByte(j$.time.temporal.p.a(a, j$.time.temporal.a.MONTH_OF_YEAR));
                objectOutput.writeByte(j$.time.temporal.p.a(a, j$.time.temporal.a.DAY_OF_MONTH));
                return;
            case 5:
                ((B) obj).B(objectOutput);
                return;
            case 6:
                ((t) obj).writeExternal(objectOutput);
                return;
            case 7:
                F f = (F) obj;
                f.getClass();
                objectOutput.writeInt(j$.time.temporal.p.a(f, j$.time.temporal.a.YEAR));
                objectOutput.writeByte(j$.time.temporal.p.a(f, j$.time.temporal.a.MONTH_OF_YEAR));
                objectOutput.writeByte(j$.time.temporal.p.a(f, j$.time.temporal.a.DAY_OF_MONTH));
                return;
            case 8:
                L l = (L) obj;
                l.getClass();
                objectOutput.writeInt(j$.time.temporal.p.a(l, j$.time.temporal.a.YEAR));
                objectOutput.writeByte(j$.time.temporal.p.a(l, j$.time.temporal.a.MONTH_OF_YEAR));
                objectOutput.writeByte(j$.time.temporal.p.a(l, j$.time.temporal.a.DAY_OF_MONTH));
                return;
            case 9:
                ((C1456k) obj).a(objectOutput);
                return;
            default:
                throw new InvalidClassException("Unknown serialized type");
        }
    }
}
