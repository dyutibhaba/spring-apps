/**
 * 
 */
/*
 * package com.docsapp.controller;
 * 
 * import java.io.FileInputStream; import java.io.FileNotFoundException; import
 * java.io.IOException; import java.io.InputStream;
 * 
 * import org.bson.types.ObjectId; import
 * org.springframework.beans.factory.annotation.Autowired; import
 * org.springframework.data.mongodb.core.query.Criteria; import
 * org.springframework.data.mongodb.core.query.Query; import
 * org.springframework.data.mongodb.gridfs.GridFsOperations; import
 * org.springframework.web.bind.annotation.GetMapping; import
 * org.springframework.web.bind.annotation.RestController;
 * 
 * import com.mongodb.BasicDBObject; import com.mongodb.DBObject; import
 * com.mongodb.client.gridfs.model.GridFSFile;
 * 
 *//**
	 * @author Bhabadyuti Bal
	 *
	 *//*
		 * @RestController public class DocsOperationController {
		 * 
		 * @Autowired private GridFsOperations gridFsOperations;
		 * 
		 * String fileId = "";
		 * 
		 * @GetMapping("/savefile") public boolean saveDocs() { DBObject dbObject = new
		 * BasicDBObject(); dbObject.put("organization", "docs");
		 * 
		 * try { InputStream inputStream = new
		 * FileInputStream("C:\\Users\\Bhabadyuti Bal\\Desktop\\Shop Architechture.png"
		 * ); dbObject.put("type", "image"); gridFsOperations.store(inputStream,
		 * "image1", dbObject); fileId = ObjectId.get().toString();
		 * System.out.println("File Id: "+fileId); } catch (FileNotFoundException e) {
		 * // TODO Auto-generated catch block e.printStackTrace(); } return true; }
		 * 
		 * @GetMapping("/getfile") public String getImageFile() throws IOException {
		 * GridFSFile gridFSFile = gridFsOperations.findOne(new
		 * Query(Criteria.where("_id").is(fileId)));
		 * 
		 * gridFSFile.getObjectId().get String filename = fsFindIterable.
		 * dbFile.writeTo("C:\\Users\\Bhabadyuti Bal\\Desktop\\docs");
		 * System.out.println("File retrieved: "+dbFile.getFilename());
		 * 
		 * return gridFSFile.getFilename();
		 * 
		 * }
		 * 
		 * }
		 */