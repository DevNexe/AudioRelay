package defpackage;

import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.nio.charset.CharacterCodingException;
import java.nio.charset.CharsetEncoder;
import java.nio.charset.CoderResult;
import java.nio.charset.MalformedInputException;

/* JADX INFO: loaded from: classes3.dex */
public final class sp {
    public static final CharBuffer a = CharBuffer.allocate(0);
    public static final ByteBuffer b = ByteBuffer.allocate(0);

    public static final boolean a(CharsetEncoder charsetEncoder, oq oqVar) {
        int i = oqVar.c;
        int i2 = oqVar.e - i;
        ByteBuffer byteBuffer = oc2.a;
        ByteBuffer byteBufferV = Th.v(oqVar.a, i, i2);
        CoderResult coderResultEncode = charsetEncoder.encode(a, byteBufferV, true);
        if (coderResultEncode.isMalformed() || coderResultEncode.isUnmappable()) {
            d(coderResultEncode);
        }
        boolean zIsUnderflow = coderResultEncode.isUnderflow();
        if (!(byteBufferV.limit() == i2)) {
            throw new IllegalStateException("Buffer's limit change is not allowed".toString());
        }
        oqVar.a(byteBufferV.position());
        return zIsUnderflow;
    }

    public static final int b(CharsetEncoder charsetEncoder, CharSequence charSequence, int i, int i2, oq oqVar) {
        CharBuffer charBufferWrap = CharBuffer.wrap(charSequence, i, i2);
        int iRemaining = charBufferWrap.remaining();
        int i3 = oqVar.c;
        int i4 = oqVar.e - i3;
        ByteBuffer byteBuffer = oc2.a;
        ByteBuffer byteBufferV = Th.v(oqVar.a, i3, i4);
        CoderResult coderResultEncode = charsetEncoder.encode(charBufferWrap, byteBufferV, false);
        if (coderResultEncode.isMalformed() || coderResultEncode.isUnmappable()) {
            d(coderResultEncode);
        }
        if (!(byteBufferV.limit() == i4)) {
            throw new IllegalStateException("Buffer's limit change is not allowed".toString());
        }
        oqVar.a(byteBufferV.position());
        return iRemaining - charBufferWrap.remaining();
    }

    /* JADX WARN: Code duplicated, block: B:19:0x0048  */
    public static final byte[] c(CharsetEncoder charsetEncoder, CharSequence charSequence, int i) throws CharacterCodingException {
        byte[] bArrArray;
        if (charSequence instanceof String) {
            return i == charSequence.length() ? ((String) charSequence).getBytes(charsetEncoder.charset()) : ((String) charSequence).substring(0, i).getBytes(charsetEncoder.charset());
        }
        ByteBuffer byteBufferEncode = charsetEncoder.encode(CharBuffer.wrap(charSequence, 0, i));
        if (byteBufferEncode.hasArray() && byteBufferEncode.arrayOffset() == 0) {
            bArrArray = byteBufferEncode.array();
            if (!(bArrArray.length == byteBufferEncode.remaining())) {
                bArrArray = null;
            }
        } else {
            bArrArray = null;
        }
        if (bArrArray != null) {
            return bArrArray;
        }
        byte[] bArr = new byte[byteBufferEncode.remaining()];
        byteBufferEncode.get(bArr);
        return bArr;
    }

    public static final void d(CoderResult coderResult) {
        try {
            coderResult.throwException();
        } catch (MalformedInputException e) {
            String message = e.getMessage();
            if (message == null) {
                message = "Failed to decode bytes";
            }
            throw new io.ktor.utils.io.charsets.MalformedInputException(message);
        }
    }
}
