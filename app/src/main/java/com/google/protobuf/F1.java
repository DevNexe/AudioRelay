package com.google.protobuf;

import com.google.protobuf.DzVS;
import defpackage.lk;
import defpackage.oz2;
import defpackage.vv0;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: loaded from: classes3.dex */
public abstract class F1<MessageType extends DzVS> implements oz2<MessageType> {
    public static final vv0 a = vv0.a();

    public static void c(DzVS dzVS) throws InvalidProtocolBufferException {
        if (dzVS == null || dzVS.isInitialized()) {
            return;
        }
        InvalidProtocolBufferException invalidProtocolBufferExceptionA = (dzVS instanceof CQf ? ((CQf) dzVS).u() : new UninitializedMessageException()).a();
        invalidProtocolBufferExceptionA.w = dzVS;
        throw invalidProtocolBufferExceptionA;
    }

    @Override // defpackage.oz2
    public final DzVS a(lk lkVar, vv0 vv0Var) throws InvalidProtocolBufferException {
        try {
            NUlFixed.QnHx qnHxH = lkVar.h();
            MessageType messagetypeB = b(qnHxH, vv0Var);
            try {
                qnHxH.a(0);
                c(messagetypeB);
                return messagetypeB;
            } catch (InvalidProtocolBufferException e) {
                e.w = messagetypeB;
                throw e;
            }
        } catch (InvalidProtocolBufferException e2) {
            throw e2;
        }
    }

    public final DzVS d(InputStream inputStream) throws InvalidProtocolBufferException {
        DzVS dzVSG = g(inputStream, a);
        c(dzVSG);
        return dzVSG;
    }

    public final DzVS e(NUlFixed nUl) throws InvalidProtocolBufferException {
        MessageType messagetypeB = b(nUl, a);
        c(messagetypeB);
        return messagetypeB;
    }

    public final DzVS f(byte[] bArr, int i, vv0 vv0Var) throws InvalidProtocolBufferException {
        try {
            NUlFixed.QnHx qnHxD = NUlFixed.d(bArr, 0, i, false);
            MessageType messagetypeB = b(qnHxD, vv0Var);
            try {
                qnHxD.a(0);
                c(messagetypeB);
                return messagetypeB;
            } catch (InvalidProtocolBufferException e) {
                e.w = messagetypeB;
                throw e;
            }
        } catch (InvalidProtocolBufferException e2) {
            throw e2;
        }
    }

    public final MessageType g(InputStream inputStream, vv0 vv0Var) throws InvalidProtocolBufferException {
        try {
            int i = inputStream.read();
            if (i == -1) {
                return null;
            }
            if ((i & 128) != 0) {
                i &= 127;
                int i2 = 7;
                while (true) {
                    if (i2 < 32) {
                        int i3 = inputStream.read();
                        if (i3 == -1) {
                            throw InvalidProtocolBufferException.f();
                        }
                        i |= (i3 & 127) << i2;
                        if ((i3 & 128) == 0) {
                            break;
                        }
                        i2 += 7;
                    } else {
                        while (true) {
                            if (i2 >= 64) {
                                throw InvalidProtocolBufferException.b();
                            }
                            int i4 = inputStream.read();
                            if (i4 == -1) {
                                throw InvalidProtocolBufferException.f();
                            }
                            if ((i4 & 128) == 0) {
                                break;
                            }
                            i2 += 7;
                        }
                    }
                }
            }
            NUlFixed.CQf cQf = new NUlFixed.CQf(new CQf.QnHx.C0089QnHx(inputStream, i));
            MessageType messagetypeB = b(cQf, vv0Var);
            try {
                cQf.a(0);
                return messagetypeB;
            } catch (InvalidProtocolBufferException e) {
                e.w = messagetypeB;
                throw e;
            }
        } catch (IOException e2) {
            throw new InvalidProtocolBufferException(e2);
        }
    }
}
