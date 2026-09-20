package defpackage;

import com.revenuecat.purchases.common.networking.RCHTTPStatusCodes;
import java.util.LinkedHashMap;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class zg1 {
    public static final List<zg1> c;
    public final int a;
    public final String b;

    static {
        List<zg1> listM = ps0.M(new zg1(100, "Continue"), new zg1(101, "Switching Protocols"), new zg1(102, "Processing"), new zg1(RCHTTPStatusCodes.SUCCESS, "OK"), new zg1(RCHTTPStatusCodes.CREATED, "Created"), new zg1(202, "Accepted"), new zg1(203, "Non-Authoritative Information"), new zg1(204, "No Content"), new zg1(205, "Reset Content"), new zg1(206, "Partial Content"), new zg1(207, "Multi-Status"), new zg1(RCHTTPStatusCodes.UNSUCCESSFUL, "Multiple Choices"), new zg1(301, "Moved Permanently"), new zg1(302, "Found"), new zg1(303, "See Other"), new zg1(RCHTTPStatusCodes.NOT_MODIFIED, "Not Modified"), new zg1(305, "Use Proxy"), new zg1(306, "Switch Proxy"), new zg1(307, "Temporary Redirect"), new zg1(308, "Permanent Redirect"), new zg1(400, "Bad Request"), new zg1(401, "Unauthorized"), new zg1(402, "Payment Required"), new zg1(403, "Forbidden"), new zg1(RCHTTPStatusCodes.NOT_FOUND, "Not Found"), new zg1(405, "Method Not Allowed"), new zg1(406, "Not Acceptable"), new zg1(407, "Proxy Authentication Required"), new zg1(408, "Request Timeout"), new zg1(409, "Conflict"), new zg1(410, "Gone"), new zg1(411, "Length Required"), new zg1(412, "Precondition Failed"), new zg1(413, "Payload Too Large"), new zg1(414, "Request-URI Too Long"), new zg1(415, "Unsupported Media Type"), new zg1(416, "Requested Range Not Satisfiable"), new zg1(417, "Expectation Failed"), new zg1(422, "Unprocessable Entity"), new zg1(423, "Locked"), new zg1(424, "Failed Dependency"), new zg1(426, "Upgrade Required"), new zg1(429, "Too Many Requests"), new zg1(431, "Request Header Fields Too Large"), new zg1(RCHTTPStatusCodes.ERROR, "Internal Server Error"), new zg1(501, "Not Implemented"), new zg1(502, "Bad Gateway"), new zg1(503, "Service Unavailable"), new zg1(504, "Gateway Timeout"), new zg1(505, "HTTP Version Not Supported"), new zg1(506, "Variant Also Negotiates"), new zg1(507, "Insufficient Storage"));
        c = listM;
        List<zg1> list = listM;
        int iA = C0239D.A(mu.w0(list, 10));
        LinkedHashMap linkedHashMap = new LinkedHashMap(iA >= 16 ? iA : 16);
        for (Object obj : list) {
            linkedHashMap.put(Integer.valueOf(((zg1) obj).a), obj);
        }
    }

    public zg1(int i, String str) {
        this.a = i;
        this.b = str;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof zg1) && ((zg1) obj).a == this.a;
    }

    public final int hashCode() {
        return this.a;
    }

    public final String toString() {
        return this.a + ' ' + this.b;
    }
}
