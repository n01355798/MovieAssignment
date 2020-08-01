
package client;

import java.math.BigInteger;
import java.util.List;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.datatype.XMLGregorianCalendar;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.8
 * Generated source version: 2.2
 * 
 */
@WebService(name = "MovieService", targetNamespace = "http://services.moviesoapservice.movie.com/")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface MovieService {


    /**
     * 
     * @return
     *     returns java.util.List<client.Movies>
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "getMovieList", targetNamespace = "http://services.moviesoapservice.movie.com/", className = "client.GetMovieList")
    @ResponseWrapper(localName = "getMovieListResponse", targetNamespace = "http://services.moviesoapservice.movie.com/", className = "client.GetMovieListResponse")
    public List<Movies> getMovieList();

    /**
     * 
     * @param id
     * @return
     *     returns client.Movies
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "getMovie", targetNamespace = "http://services.moviesoapservice.movie.com/", className = "client.GetMovie")
    @ResponseWrapper(localName = "getMovieResponse", targetNamespace = "http://services.moviesoapservice.movie.com/", className = "client.GetMovieResponse")
    public Movies getMovie(
        @WebParam(name = "id", targetNamespace = "")
        BigInteger id);

    /**
     * 
     * @param name
     * @return
     *     returns java.lang.String
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "hello", targetNamespace = "http://services.moviesoapservice.movie.com/", className = "client.Hello")
    @ResponseWrapper(localName = "helloResponse", targetNamespace = "http://services.moviesoapservice.movie.com/", className = "client.HelloResponse")
    public String hello(
        @WebParam(name = "name", targetNamespace = "")
        String name);

    /**
     * 
     * @param filename
     * @param series
     * @param release
     * @param name
     * @param id
     * @param type
     * @param content
     * @return
     *     returns int
     * @throws Exception_Exception
     */
    @WebMethod
    @WebResult(name = "length", targetNamespace = "")
    @RequestWrapper(localName = "updateMovie", targetNamespace = "http://services.moviesoapservice.movie.com/", className = "client.UpdateMovie")
    @ResponseWrapper(localName = "updateMovieResponse", targetNamespace = "http://services.moviesoapservice.movie.com/", className = "client.UpdateMovieResponse")
    public int updateMovie(
        @WebParam(name = "id", targetNamespace = "")
        BigInteger id,
        @WebParam(name = "name", targetNamespace = "")
        String name,
        @WebParam(name = "type", targetNamespace = "")
        String type,
        @WebParam(name = "series", targetNamespace = "")
        String series,
        @WebParam(name = "release", targetNamespace = "")
        XMLGregorianCalendar release,
        @WebParam(name = "filename", targetNamespace = "")
        String filename,
        @WebParam(name = "content", targetNamespace = "")
        byte[] content)
        throws Exception_Exception
    ;

    /**
     * 
     * @param filename
     * @param series
     * @param release
     * @param name
     * @param type
     * @param content
     * @return
     *     returns int
     */
    @WebMethod
    @WebResult(name = "length", targetNamespace = "")
    @RequestWrapper(localName = "upload", targetNamespace = "http://services.moviesoapservice.movie.com/", className = "client.Upload")
    @ResponseWrapper(localName = "uploadResponse", targetNamespace = "http://services.moviesoapservice.movie.com/", className = "client.UploadResponse")
    public int upload(
        @WebParam(name = "name", targetNamespace = "")
        String name,
        @WebParam(name = "type", targetNamespace = "")
        String type,
        @WebParam(name = "series", targetNamespace = "")
        String series,
        @WebParam(name = "release", targetNamespace = "")
        XMLGregorianCalendar release,
        @WebParam(name = "filename", targetNamespace = "")
        String filename,
        @WebParam(name = "content", targetNamespace = "")
        byte[] content);

    /**
     * 
     * @param id
     * @return
     *     returns int
     * @throws IllegalOrphanException_Exception
     * @throws NonexistentEntityException_Exception
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "deleteMovie", targetNamespace = "http://services.moviesoapservice.movie.com/", className = "client.DeleteMovie")
    @ResponseWrapper(localName = "deleteMovieResponse", targetNamespace = "http://services.moviesoapservice.movie.com/", className = "client.DeleteMovieResponse")
    public int deleteMovie(
        @WebParam(name = "id", targetNamespace = "")
        BigInteger id)
        throws IllegalOrphanException_Exception, NonexistentEntityException_Exception
    ;

    /**
     * 
     * @param id
     * @return
     *     returns byte[]
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "download", targetNamespace = "http://services.moviesoapservice.movie.com/", className = "client.Download")
    @ResponseWrapper(localName = "downloadResponse", targetNamespace = "http://services.moviesoapservice.movie.com/", className = "client.DownloadResponse")
    public byte[] download(
        @WebParam(name = "id", targetNamespace = "")
        BigInteger id);

}
