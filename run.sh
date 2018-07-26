#!/bin/bash

ivypath="/mnt/c/Users/hp/.ivy2/cache"

#export JAVA_HOME="/mnt/c/progra~1/Java/jdk1.8.0_162"
export PATH="/mnt/c/apache-maven-3.5.4/bin:$PATH"

for i in `find /mnt/c/Users/hp/.ivy2/cache  -name "*.jar" -type f`; do
	  echo $(dirname $i) $(basename $i)
	  filename="${i##*/}"  # get filename
	  dirname="${i%/*}" # get directory/path name
	  #echo 'filename = ' $filename
	  #echo 'dirname = ' $dirname
	  #echo 'ivypath = ' $ivypath

	  JARPATH="${filename%.*}"   #strip .jar
	  VERSION="${JARPATH##*-}"   #extract version


	  dirpath1="${dirname#*/}"   #extract version
	  dirpath2="${dirpath1#*/}"   #extract version
	  dirpath3="${dirpath2#*/}"   #extract version
	  dirpath3="${dirpath3#*/}"   #extract version
	  dirpath3="${dirpath3#*/}"   #extract version
	  dirpath3="${dirpath3#*/}"   #extract version
	  echo 'dirpath3 = ' $dirpath3
	  filename3=$dirpath3'/'$filename
	  echo 'filename3 = ' $filename3

	  dname="$dirname"
	  #echo 'dirname = ' $dname
	  cmd=`echo \"$dname\"`
	  CXPATH=''
	  while [ $dname != $ivypath ]
	  do
		     dname="${dname%/*}"
		     #   echo 'in while dname = ' $dname
		        CXPATH=$CXPATH','$dname
			#   echo $CXPATH

		done

		XPATH="${CXPATH%,*}"   #strip jars
		#echo 'xpath = ' $XPATH

		artiID="${XPATH##*,}"   #extract artifactID

		ARTIFACTID="${artiID##*/}"


		grouptok="${artiID%%*,}"
		GROUPID="${grouptok##*/}"   #extract groupID
		#echo 'groupId = ' $GROUPID
		#echo 'artifactId = ' $ARTIFACTID
		#echo 'version = ' $VERSION
		echo 'filename = ' $i

		CMD='mvn -X -e install:install-file -DgroupId='$GROUPID' -DartifactId='$ARTIFACTID' -Dversion='$VERSION' -Dfile='$filename3' -Dpackaging=jar -DgeneratePom=true -DlocalRepositoryPath=.  -DcreateChecksum=true'
		echo 'processing ' $CMD


		echo ""
		result=`$CMD`
		echo $result
		echo ""

	done
